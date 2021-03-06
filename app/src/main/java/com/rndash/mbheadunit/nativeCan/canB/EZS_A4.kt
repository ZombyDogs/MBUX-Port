
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for EZS_A4 (ID 0x0058)
**/

object EZS_A4 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of EZS_A4
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.EZS_A4)

	/** Gets Identification key for pre-filtering **/
	fun get_schlue_id() : Int = CanBusNative.getECUParameterB(CanBAddrs.EZS_A4, 0, 32)
	
	/** Sets Identification key for pre-filtering **/
	fun set_schlue_id(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 0, 32, p)
	}
	
	/** Gets Mileage  **/
	fun get_km_ezs() : Int = CanBusNative.getECUParameterB(CanBAddrs.EZS_A4, 32, 24)
	
	/** Sets Mileage  **/
	fun set_km_ezs(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 32, 24, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.EZS_A4.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame EZS_A4 (0x0058):
		|	Identification key for pre-filtering: ${get_schlue_id()}
		|	Mileage : ${get_km_ezs()} km
	""".trimMargin("|")
}
