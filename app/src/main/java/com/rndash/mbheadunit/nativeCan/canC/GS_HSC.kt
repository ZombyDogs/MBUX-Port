
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for GS_HSC (ID 0x050C)
**/

object GS_HSC {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of GS_HSC
    **/
    fun get_frame() : CanFrame? = CanBusNative.getCFrame(CanCAddrs.GS_HSC)

	/** Gets manual control on the test bench **/
	fun get_hsc() : Int = CanBusNative.getECUParameterC(CanCAddrs.GS_HSC, 0, 64)
	
	/** Sets manual control on the test bench **/
	fun set_hsc(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 0, 64, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanCAddrs.GS_HSC.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame GS_HSC (0x050C):
		|	manual control on the test bench: ${get_hsc()}
	""".trimMargin("|")
}
