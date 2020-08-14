package com.rndash.mbheadunit.nativeCan.canC


import com.rndash.mbheadunit.nativeCan.CanCAddrs
import com.rndash.mbheadunit.nativeCan.CanBusNative



/**
 *    GENERATED BY parse_kt.py
 *    Decoder class for ECU Frame KLA_40Eh (ID: 0x040E)
**/
object KLA_40Eh {

	/** Anforderung Heizleistung **/
	fun get_hzl_anf() : Int = getParam(0, 8)

	override fun toString(): String {
		return """
			HZL_ANF: ${get_hzl_anf()}
		""".trimIndent()
	}


	private fun getParam(o: Int, l: Int) : Int = CanBusNative.getECUParameterC(CanCAddrs.KLA_40Eh, o, l)
}