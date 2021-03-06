
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for EZS_A1 (ID 0x0000)
**/

object EZS_A1 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of EZS_A1
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.EZS_A1)

	/** Gets Authentic key is inserted (position 0) **/
	fun get_kl_15c_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 7, 1) != 0
	
	/** Sets Authentic key is inserted (position 0) **/
	fun set_kl_15c_ein(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 7, 1, if(p) 1 else 0)
	}
	
	/** Gets Terminal 15R is switched on **/
	fun get_kl_15r_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 6, 1) != 0
	
	/** Sets Terminal 15R is switched on **/
	fun set_kl_15r_ein(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 6, 1, if(p) 1 else 0)
	}
	
	/** Gets Terminal 15 is switched on **/
	fun get_kl_15_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 5, 1) != 0
	
	/** Sets Terminal 15 is switched on **/
	fun set_kl_15_ein(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 5, 1, if(p) 1 else 0)
	}
	
	/** Gets Terminal 15X is switched on **/
	fun get_kl_15x_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 4, 1) != 0
	
	/** Sets Terminal 15X is switched on **/
	fun set_kl_15x_ein(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 4, 1, if(p) 1 else 0)
	}
	
	/** Gets Terminal 50 is switched on **/
	fun get_kl_50_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 3, 1) != 0
	
	/** Sets Terminal 50 is switched on **/
	fun set_kl_50_ein(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 3, 1, if(p) 1 else 0)
	}
	
	/** Gets Keyless Go terminal control active **/
	fun get_kg_kl_akt() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 0, 1) != 0
	
	/** Sets Keyless Go terminal control active **/
	fun set_kg_kl_akt(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 0, 1, if(p) 1 else 0)
	}
	
	/** Gets Remote triggering of the MSS alarm **/
	fun get_fern_alarm() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 13, 1) != 0
	
	/** Sets Remote triggering of the MSS alarm **/
	fun set_fern_alarm(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 13, 1, if(p) 1 else 0)
	}
	
	/** Gets Panic alarm by key on **/
	fun get_pnk_alm_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 12, 1) != 0
	
	/** Sets Panic alarm by key on **/
	fun set_pnk_alm_ein(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 12, 1, if(p) 1 else 0)
	}
	
	/** Gets Panic alarm by key off **/
	fun get_pnk_alm_aus() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 11, 1) != 0
	
	/** Sets Panic alarm by key off **/
	fun set_pnk_alm_aus(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 11, 1, if(p) 1 else 0)
	}
	
	/** Gets Do not send application IDs, only NM IDs **/
	fun get_appl_aus() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 10, 1) != 0
	
	/** Sets Do not send application IDs, only NM IDs **/
	fun set_appl_aus(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 10, 1, if(p) 1 else 0)
	}
	
	/** Gets Diagnosis toggle bit **/
	fun get_diag_tgl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 9, 1) != 0
	
	/** Sets Diagnosis toggle bit **/
	fun set_diag_tgl(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 9, 1, if(p) 1 else 0)
	}
	
	/** Gets Message: "Vehicle is calculating, please wait" **/
	fun get_fzg_rech() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 8, 1) != 0
	
	/** Sets Message: "Vehicle is calculating, please wait" **/
	fun set_fzg_rech(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 8, 1, if(p) 1 else 0)
	}
	
	/** Gets Current memory block number **/
	fun get_spei_nr() : SPEI_NR = when(CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 21, 3)) {
		 0 -> SPEI_NR.MEMORY1
		 1 -> SPEI_NR.MEMORY2
		 2 -> SPEI_NR.MEMORY3
		 3 -> SPEI_NR.NOT_DEFINED
		 4 -> SPEI_NR.NOT_DEFINED_4
		 5 -> SPEI_NR.NOT_DEFINED_5
		 6 -> SPEI_NR.NOT_DEFINED_6
		 7 -> SPEI_NR.SNV
		 else -> throw Exception("Invalid raw value for SPEI_NR")
	}
	
	/** Sets Current memory block number **/
	fun set_spei_nr(f: CanFrame, p: SPEI_NR) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 21, 3, p.raw)
	}
	
	/** Gets Stop the trunk lid **/
	fun get_hd_stopp() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 19, 1) != 0
	
	/** Sets Stop the trunk lid **/
	fun set_hd_stopp(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 19, 1, if(p) 1 else 0)
	}
	
	/** Gets Backlash protection active **/
	fun get_zv_spiel() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 18, 1) != 0
	
	/** Sets Backlash protection active **/
	fun set_zv_spiel(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 18, 1, if(p) 1 else 0)
	}
	
	/** Gets Passive locking **/
	fun get_zv_passiv() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 17, 1) != 0
	
	/** Sets Passive locking **/
	fun set_zv_passiv(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 17, 1, if(p) 1 else 0)
	}
	
	/** Gets Message: Renew key **/
	fun get_schlue_neu() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 16, 1) != 0
	
	/** Sets Message: Renew key **/
	fun set_schlue_neu(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 16, 1, if(p) 1 else 0)
	}
	
	/** Gets Unlock ZV blinker feedback **/
	fun get_bli_entsi() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 27, 1) != 0
	
	/** Sets Unlock ZV blinker feedback **/
	fun set_bli_entsi(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 27, 1, if(p) 1 else 0)
	}
	
	/** Gets ZV secure blinker feedback **/
	fun get_bli_sich() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 26, 1) != 0
	
	/** Sets ZV secure blinker feedback **/
	fun set_bli_sich(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 26, 1, if(p) 1 else 0)
	}
	
	/** Gets External release **/
	fun get_auss_entsi() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 25, 1) != 0
	
	/** Sets External release **/
	fun set_auss_entsi(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 25, 1, if(p) 1 else 0)
	}
	
	/** Gets external security **/
	fun get_auss_sich() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 24, 1) != 0
	
	/** Sets external security **/
	fun set_auss_sich(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 24, 1, if(p) 1 else 0)
	}
	
	/** Gets Mechanical / FB key active **/
	fun get_schl_bef() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 39, 1) != 0
	
	/** Sets Mechanical / FB key active **/
	fun set_schl_bef(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 39, 1, if(p) 1 else 0)
	}
	
	/** Gets ZV post-locking **/
	fun get_zv_nv() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 38, 1) != 0
	
	/** Sets ZV post-locking **/
	fun set_zv_nv(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 38, 1, if(p) 1 else 0)
	}
	
	/** Gets Unlock the tank lid (HSF / storage compartments) **/
	fun get_td_entri() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 36, 1) != 0
	
	/** Sets Unlock the tank lid (HSF / storage compartments) **/
	fun set_td_entri(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 36, 1, if(p) 1 else 0)
	}
	
	/** Gets Lock the tank lid (HSF / storage compartments) **/
	fun get_td_verri() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 35, 1) != 0
	
	/** Sets Lock the tank lid (HSF / storage compartments) **/
	fun set_td_verri(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 35, 1, if(p) 1 else 0)
	}
	
	/** Gets Unlock the trunk lid **/
	fun get_hd_entsi() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 34, 1) != 0
	
	/** Sets Unlock the trunk lid **/
	fun set_hd_entsi(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 34, 1, if(p) 1 else 0)
	}
	
	/** Gets secure trunk lid **/
	fun get_hd_sich() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 33, 1) != 0
	
	/** Sets secure trunk lid **/
	fun set_hd_sich(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 33, 1, if(p) 1 else 0)
	}
	
	/** Gets trunk lid remote unlocking **/
	fun get_hfe_ezs() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 32, 1) != 0
	
	/** Sets trunk lid remote unlocking **/
	fun set_hfe_ezs(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 32, 1, if(p) 1 else 0)
	}
	
	/** Gets Unlock the front left door **/
	fun get_tvl_entri() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 47, 1) != 0
	
	/** Sets Unlock the front left door **/
	fun set_tvl_entri(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 47, 1, if(p) 1 else 0)
	}
	
	/** Gets lock the front left door **/
	fun get_tvl_verri() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 46, 1) != 0
	
	/** Sets lock the front left door **/
	fun set_tvl_verri(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 46, 1, if(p) 1 else 0)
	}
	
	/** Gets Unlock the front right door **/
	fun get_tvr_entri() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 45, 1) != 0
	
	/** Sets Unlock the front right door **/
	fun set_tvr_entri(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 45, 1, if(p) 1 else 0)
	}
	
	/** Gets lock the front right door **/
	fun get_tvr_verri() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 44, 1) != 0
	
	/** Sets lock the front right door **/
	fun set_tvr_verri(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 44, 1, if(p) 1 else 0)
	}
	
	/** Gets Unlock the rear left door **/
	fun get_thl_entri() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 43, 1) != 0
	
	/** Sets Unlock the rear left door **/
	fun set_thl_entri(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 43, 1, if(p) 1 else 0)
	}
	
	/** Gets Lock the rear left door **/
	fun get_thl_verri() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 42, 1) != 0
	
	/** Sets Lock the rear left door **/
	fun set_thl_verri(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 42, 1, if(p) 1 else 0)
	}
	
	/** Gets Unlock the rear right door **/
	fun get_thr_entri() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 41, 1) != 0
	
	/** Sets Unlock the rear right door **/
	fun set_thr_entri(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 41, 1, if(p) 1 else 0)
	}
	
	/** Gets Lock the rear right door **/
	fun get_thr_verri() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, 40, 1) != 0
	
	/** Sets Lock the rear right door **/
	fun set_thr_verri(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 40, 1, if(p) 1 else 0)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.EZS_A1.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame EZS_A1 (0x0000):
		|	Authentic key is inserted (position 0): ${get_kl_15c_ein()}
		|	Terminal 15R is switched on: ${get_kl_15r_ein()}
		|	Terminal 15 is switched on: ${get_kl_15_ein()}
		|	Terminal 15X is switched on: ${get_kl_15x_ein()}
		|	Terminal 50 is switched on: ${get_kl_50_ein()}
		|	Keyless Go terminal control active: ${get_kg_kl_akt()}
		|	Remote triggering of the MSS alarm: ${get_fern_alarm()}
		|	Panic alarm by key on: ${get_pnk_alm_ein()}
		|	Panic alarm by key off: ${get_pnk_alm_aus()}
		|	Do not send application IDs, only NM IDs: ${get_appl_aus()}
		|	Diagnosis toggle bit: ${get_diag_tgl()}
		|	Message: "Vehicle is calculating, please wait": ${get_fzg_rech()}
		|	Current memory block number: ${get_spei_nr()}
		|	Stop the trunk lid: ${get_hd_stopp()}
		|	Backlash protection active: ${get_zv_spiel()}
		|	Passive locking: ${get_zv_passiv()}
		|	Message: Renew key: ${get_schlue_neu()}
		|	Unlock ZV blinker feedback: ${get_bli_entsi()}
		|	ZV secure blinker feedback: ${get_bli_sich()}
		|	External release: ${get_auss_entsi()}
		|	external security: ${get_auss_sich()}
		|	Mechanical / FB key active: ${get_schl_bef()}
		|	ZV post-locking: ${get_zv_nv()}
		|	Unlock the tank lid (HSF / storage compartments): ${get_td_entri()}
		|	Lock the tank lid (HSF / storage compartments): ${get_td_verri()}
		|	Unlock the trunk lid: ${get_hd_entsi()}
		|	secure trunk lid: ${get_hd_sich()}
		|	trunk lid remote unlocking: ${get_hfe_ezs()}
		|	Unlock the front left door: ${get_tvl_entri()}
		|	lock the front left door: ${get_tvl_verri()}
		|	Unlock the front right door: ${get_tvr_entri()}
		|	lock the front right door: ${get_tvr_verri()}
		|	Unlock the rear left door: ${get_thl_entri()}
		|	Lock the rear left door: ${get_thl_verri()}
		|	Unlock the rear right door: ${get_thr_entri()}
		|	Lock the rear right door: ${get_thr_verri()}
	""".trimMargin("|")
}
