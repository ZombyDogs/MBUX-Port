
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for MS_2F3h (ID 0x02F3)
**/

object MS_2F3h {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of MS_2F3h
    **/
    fun get_frame() : CanFrame? = CanBusNative.getCFrame(CanCAddrs.MS_2F3h)

	/** Gets Gear step shift recommendation "Actual" **/
	fun get_fsc_ist() : FSC_IST = when(CanBusNative.getECUParameterC(CanCAddrs.MS_2F3h, 0, 8)) {
		 32 -> FSC_IST.BLANK
		 49 -> FSC_IST.ONE
		 50 -> FSC_IST.TWO
		 51 -> FSC_IST.THREE
		 52 -> FSC_IST.FOUR
		 53 -> FSC_IST.FUENF
		 54 -> FSC_IST.SIX
		 55 -> FSC_IST.SEVEN
		 65 -> FSC_IST.A
		 68 -> FSC_IST.D
		 70 -> FSC_IST.F_ERROR_MARK
		 78 -> FSC_IST.N
		 80 -> FSC_IST.P
		 82 -> FSC_IST.R
		 255 -> FSC_IST.SNV
		 else -> throw Exception("Invalid raw value for FSC_IST")
	}
	
	/** Sets Gear step shift recommendation "Actual" **/
	fun set_fsc_ist(f: CanFrame, p: FSC_IST) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 0, 8, p.raw)
	}
	
	/** Gets Gear step shift recommendation "target" **/
	fun get_fsc_soll() : FSC_SOLL = when(CanBusNative.getECUParameterC(CanCAddrs.MS_2F3h, 40, 8)) {
		 1 -> FSC_SOLL.UP
		 2 -> FSC_SOLL.DOWN
		 32 -> FSC_SOLL.PAS
		 49 -> FSC_SOLL.ONE
		 50 -> FSC_SOLL.TWO
		 51 -> FSC_SOLL.THREE
		 52 -> FSC_SOLL.FOUR
		 53 -> FSC_SOLL.FUENF
		 54 -> FSC_SOLL.SIX
		 55 -> FSC_SOLL.SEVEN
		 65 -> FSC_SOLL.A
		 68 -> FSC_SOLL.D
		 70 -> FSC_SOLL.F_ERROR_MARK
		 78 -> FSC_SOLL.N
		 80 -> FSC_SOLL.P
		 82 -> FSC_SOLL.R
		 255 -> FSC_SOLL.SNV
		 else -> throw Exception("Invalid raw value for FSC_SOLL")
	}
	
	/** Sets Gear step shift recommendation "target" **/
	fun set_fsc_soll(f: CanFrame, p: FSC_SOLL) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 40, 8, p.raw)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanCAddrs.MS_2F3h.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame MS_2F3h (0x02F3):
		|	Gear step shift recommendation "Actual": ${get_fsc_ist()}
		|	Gear step shift recommendation "target": ${get_fsc_soll()}
	""".trimMargin("|")
}
