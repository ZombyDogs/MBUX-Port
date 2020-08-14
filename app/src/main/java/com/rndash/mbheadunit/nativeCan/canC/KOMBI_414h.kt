package com.rndash.mbheadunit.nativeCan.canC


import com.rndash.mbheadunit.nativeCan.CanCAddrs
import com.rndash.mbheadunit.nativeCan.CanBusNative



/**
 *    GENERATED BY parse_kt.py
 *    Decoder class for ECU Frame KOMBI_414h (ID: 0x0414)
**/
object KOMBI_414h {

	/** gefilterte Außentemperatur Kombi **/
	fun get_t_aussen_k() : Int = getParam(0, 8)

	override fun toString(): String {
		return """
			T_AUSSEN_K: ${get_t_aussen_k()}
		""".trimIndent()
	}


	private fun getParam(o: Int, l: Int) : Int = CanBusNative.getECUParameterC(CanCAddrs.KOMBI_414h, o, l)
}