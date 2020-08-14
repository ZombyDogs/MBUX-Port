package com.rndash.mbheadunit.nativeCan.canC


import com.rndash.mbheadunit.nativeCan.CanCAddrs
import com.rndash.mbheadunit.nativeCan.CanBusNative



/**
 *    GENERATED BY parse_kt.py
 *    Decoder class for ECU Frame AAD_580h (ID: 0x0580)
**/
object AAD_580h {

	/** Code acceleration type (> 100: dynamic) **/
	fun get_ftk_bmi() : Int = getParam(0, 8)

	/** Code type lateral acceleration (> 100: dynamic) **/
	fun get_ftk_lmi() : Int = getParam(8, 8)

	/** Code brake type (> 100: dynamic) **/
	fun get_ftk_vmi() : Int = getParam(16, 8)

	/** Max. Diff. Pedal angle value per maneuvers **/
	fun get_ftk_dpw() : Int = getParam(32, 8)

	/** Continuous driver observation **/
	fun get_aadkb() : Int = getParam(40, 8)

	/** Spontaneous dynamic request **/
	fun get_aadkbdyn() : Boolean = getParam(48, 1) != 0

	/** nervousness **/
	fun get_aadnt() : Int = getParam(56, 8)

	override fun toString(): String {
		return """
			FTK_BMI: ${get_ftk_bmi()}
			FTK_LMI: ${get_ftk_lmi()}
			FTK_VMI: ${get_ftk_vmi()}
			FTK_DPW: ${get_ftk_dpw()}
			AADKB: ${get_aadkb()}
			AADKBDYN: ${get_aadkbdyn()}
			AADNT: ${get_aadnt()}
		""".trimIndent()
	}


	private fun getParam(o: Int, l: Int) : Int = CanBusNative.getECUParameterC(CanCAddrs.AAD_580h, o, l)
}