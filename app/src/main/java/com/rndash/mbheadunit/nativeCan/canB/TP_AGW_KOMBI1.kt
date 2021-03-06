
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for TP_AGW_KOMBI1 (ID 0x01A4)
**/

object TP_AGW_KOMBI1 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of TP_AGW_KOMBI1
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.TP_AGW_KOMBI1)

	/** Gets communication AGW to KOMBI **/
	fun get_tp_agw_kombi() : Int = CanBusNative.getECUParameterB(CanBAddrs.TP_AGW_KOMBI1, 0, 64)
	
	/** Sets communication AGW to KOMBI **/
	fun set_tp_agw_kombi(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 0, 64, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.TP_AGW_KOMBI1.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame TP_AGW_KOMBI1 (0x01A4):
		|	communication AGW to KOMBI: ${get_tp_agw_kombi()}
	""".trimMargin("|")
}
