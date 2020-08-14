package com.rndash.mbheadunit.nativeCan.canC


import com.rndash.mbheadunit.nativeCan.CanCAddrs
import com.rndash.mbheadunit.nativeCan.CanBusNative



/**
 *    GENERATED BY parse_kt.py
 *    Decoder class for ECU Frame GS_418h (ID: 0x0418)
**/
object GS_418h {

	/** driving position **/
	fun get_fsc() : Int = getParam(0, 8)

	/** driving program **/
	fun get_fpc() : Int = getParam(8, 8)

	/** Transmission oil temperature **/
	fun get_t_get() : Int = getParam(16, 8)

	/** all wheel drive **/
	fun get_allrad() : Boolean = getParam(24, 1) != 0

	/** Front-wheel drive [1], rear-wheel drive [0] **/
	fun get_front() : Boolean = getParam(25, 1) != 0

	/** circuit **/
	fun get_schalt() : Boolean = getParam(26, 1) != 0

	/** Continuously variable transmission [1], step transmission [0] **/
	fun get_cvt() : Boolean = getParam(27, 1) != 0

	/** Gear-mechanism variant **/
	fun get_mech() : Int = getParam(28, 2)

	/** Brake invest in power- **/
	fun get_esv_bre() : Boolean = getParam(30, 1) != 0

	/** Kick down **/
	fun get_kd() : Boolean = getParam(31, 1) != 0

	/** Target gear **/
	fun get_gzc() : Int = getParam(32, 4)

	/** Actual gear **/
	fun get_gic() : Int = getParam(36, 4)

	/** Loss torque (FFh at KSG) **/
	fun get_m_verl() : Int = getParam(40, 8)

	/** Factor wheel torque parity (even parity) **/
	fun get_fmradpar() : Boolean = getParam(48, 1) != 0

	/** Factor wheel torque Toggle 40ms + -10 **/
	fun get_fmradtgl() : Boolean = getParam(49, 1) != 0

	/** Gear selector lever position (NAG, KSG, CVT) **/
	fun get_whst() : Int = getParam(50, 3)

	/** Factor wheel torque (7FFh KSG) **/
	fun get_fmrad() : Int = getParam(53, 11)

	override fun toString(): String {
		return """
			FSC: ${get_fsc()}
			FPC: ${get_fpc()}
			T_GET: ${get_t_get()}
			ALLRAD: ${get_allrad()}
			FRONT: ${get_front()}
			SCHALT: ${get_schalt()}
			CVT: ${get_cvt()}
			MECH: ${get_mech()}
			ESV_BRE: ${get_esv_bre()}
			KD: ${get_kd()}
			GZC: ${get_gzc()}
			GIC: ${get_gic()}
			M_VERL: ${get_m_verl()}
			FMRADPAR: ${get_fmradpar()}
			FMRADTGL: ${get_fmradtgl()}
			WHST: ${get_whst()}
			FMRAD: ${get_fmrad()}
		""".trimIndent()
	}


	private fun getParam(o: Int, l: Int) : Int = CanBusNative.getECUParameterC(CanCAddrs.GS_418h, o, l)
}