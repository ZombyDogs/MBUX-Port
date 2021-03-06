
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for SAM_H_A2 (ID 0x0090)
**/

object SAM_H_A2 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of SAM_H_A2
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.SAM_H_A2)

	/** Gets Tank level  **/
	fun get_tank_fs_b() : Int = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A2, 0, 8)
	
	/** Sets Tank level  **/
	fun set_tank_fs_b(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 0, 8, p)
	}
	
	/** Gets Tank sensor value right  **/
	fun get_tank_ge_re() : Int = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A2, 8, 8)
	
	/** Sets Tank sensor value right  **/
	fun set_tank_ge_re(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 8, 8, p)
	}
	
	/** Gets Tank sensor value left  **/
	fun get_tank_ge_li() : Int = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A2, 16, 8)
	
	/** Sets Tank sensor value left  **/
	fun set_tank_ge_li(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 16, 8, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.SAM_H_A2.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame SAM_H_A2 (0x0090):
		|	Tank level : ${get_tank_fs_b()} %
		|	Tank sensor value right : ${get_tank_ge_re()} %
		|	Tank sensor value left : ${get_tank_ge_li()} %
	""".trimMargin("|")
}
