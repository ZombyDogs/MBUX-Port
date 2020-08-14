package com.rndash.mbheadunit.nativeCan.canC


import com.rndash.mbheadunit.nativeCan.CanCAddrs
import com.rndash.mbheadunit.nativeCan.CanBusNative



/**
 *    GENERATED BY parse_kt.py
 *    Decoder class for ECU Frame GS_HSE (ID: 0x050E)
**/
object GS_HSE {

	/** Handsteuerung am Prüfstand **/
	fun get_hse() : Int = getParam(0, 64)

	override fun toString(): String {
		return """
			HSE: ${get_hse()}
		""".trimIndent()
	}


	private fun getParam(o: Int, l: Int) : Int = CanBusNative.getECUParameterC(CanCAddrs.GS_HSE, o, l)
}