
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for FBS_110h (ID 0x0110)
**/

object FBS_110h {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of FBS_110h
    **/
    fun get_frame() : CanFrame? = CanBusNative.getCFrame(CanCAddrs.FBS_110h)

	/** Gets FBS message to MS (8 bytes) **/
	fun get_ifz_st() : Int = CanBusNative.getECUParameterC(CanCAddrs.FBS_110h, 0, 64)
	
	/** Sets FBS message to MS (8 bytes) **/
	fun set_ifz_st(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 0, 64, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanCAddrs.FBS_110h.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame FBS_110h (0x0110):
		|	FBS message to MS (8 bytes): ${get_ifz_st()}
	""".trimMargin("|")
}
