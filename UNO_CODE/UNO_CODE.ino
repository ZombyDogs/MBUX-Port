 
#include <Arduino.h>
#include "mcp2515.h"

// Change these 2 defines if your CS pins are different
// They CANNOT be the same
#define CANB_CS 4
#define CANC_CS 5

MCP2515* canC;
MCP2515* canB;

// IO struct with the tablet
// It is a compressed CAN Frame
struct tablet_frame {
    char can_bus_id;
    uint16_t id; // First 2 bytes for these cars are always 0000, so ignore
    uint8_t dlc;
    uint8_t data[8];
};

const uint8_t FRAME_SIZE = sizeof(tablet_frame);

tablet_frame io_frame = {0x00}; // Reserve in memory
can_frame io_can_frame = {0x00}; // Reserve this in memory as well

void setup() {
    Serial.begin(115200);

    // Init the CAN modules
    canB = new MCP2515(CANB_CS);
    canC = new MCP2515(CANC_CS);
    canB->reset();
    canC->reset();
    canB->setBitrate(CAN_83K3BPS);
    canC->setBitrate(CAN_500KBPS);
    // I trust myself to write to CAN B
    // Set it as Read + Write
    canB->setNormalMode();

    // I don't trust myself to write to CAN C
    // Set it as read only!
    canC->setListenOnlyMode(); 

    // TODO - Filtering - We don't need EVERY message on either bus!
}

char writeBuf[30]={0x00};
void writeFrame(char bus_id, can_frame* f) {
    memset(writeBuf, 0x00, sizeof(writeBuf));
    uint8_t pos = 0;
    pos += sprintf(writeBuf, "%c%04X", bus_id, f->can_id);
    for (int i = 0; i < f->can_dlc; i++) {
        pos+=sprintf(writeBuf+pos, "%02X", f->data[i]);
    }
    Serial.println(writeBuf);
}


unsigned long lastTime = millis();
void loop() {
    // Incomming request from tablet! - Send to CAN
    if (Serial.available() >= FRAME_SIZE) {
        Serial.readBytes((char*)&io_frame, FRAME_SIZE);
        io_can_frame.can_id = io_frame.id;
        io_can_frame.can_dlc = io_frame.dlc;
        memcpy(io_can_frame.data, io_frame.data, io_frame.dlc);
        switch (io_frame.can_bus_id)
        {
        case 'C':
            canC->sendMessage(&io_can_frame);
            break;
        case 'B':
            canB->sendMessage(&io_can_frame);
            break;
        default:
            break;
        }
    }
    // Poll for any new CAN frames on Bus B
    if (canB->readMessage(&io_can_frame) == MCP2515::ERROR_OK) {
        writeFrame('B', &io_can_frame);
    }
    // Poll for any new CAN frames on Bus C
    if (canC->readMessage(&io_can_frame) == MCP2515::ERROR_OK) {
        writeFrame('C', &io_can_frame);
    }

    /*
    // Debug only for desk purposes
    io_can_frame.can_dlc = 8;
    io_can_frame.can_id = 0x00AA;
    io_can_frame.data[0] = 0x00;
    io_can_frame.data[1] = 0x01;
    io_can_frame.data[2] = 0x02;
    io_can_frame.data[3] = 0x03;
    io_can_frame.data[4] = 0x04;
    io_can_frame.data[5] = 0x05;
    io_can_frame.data[6] = 0x06;
    io_can_frame.data[7] = 0x07;
    if (random(1) == 1) {
        writeFrame('B', &io_can_frame);
    } else {
        writeFrame('C', &io_can_frame);
    }
    */
}