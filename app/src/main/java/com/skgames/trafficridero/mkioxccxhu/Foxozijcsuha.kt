package com.skgames.trafficridero.mkioxccxhu

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.skgames.trafficridero.bgxuzu.Gtsuixijcjix

import com.skgames.trafficridero.bgxuzu.Diosooxkczji
import com.skgames.trafficridero.bgxuzu.Misjijxuhuchzx
import com.skgames.trafficridero.bgxuzu.Szokxzcjis
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class Foxozijcsuha(
    private val xcijcvxjiv: Diosooxkczji,
    private val okcvjicvij: Gtsuixijcjix,
    private val eokskodaskd: SharedPreferences,
    val oozkzkkzx: Application
) : ViewModel() {

    init {
        viewModelScope.launch(Dispatchers.IO) {
            axzxpxocz()
        }
        viewModelScope.launch(Dispatchers.Main) {
            fookookxcxcijxcz()
        }
    }





    private val owkdkw = MutableLiveData<Misjijxuhuchzx>()
    val ixzjijci: LiveData<Misjijxuhuchzx>
        get() = owkdkw

    private val icjxvjvcxi = MutableLiveData<Szokxzcjis>()
    val eijsdajiasd: LiveData<Szokxzcjis>
        get() = icjxvjvcxi




    private val fokgokf = MutableLiveData<String>()
    val xock: LiveData<String>
        get() = fokgokf




    suspend fun fookookxcxcijxcz() {
        owkdkw.postValue(xcijcvxjiv.roeokkodfij().body())
        oqkoijijsdjisdji()
    }




    fun oosjidjiijxc(qoskd: Context) {
        AppsFlyerLib.getInstance()
            .init("zVTHAbUL3rEeD2yBTdA56a", bijvjinjijivb, oozkzkkzx)
        AppsFlyerLib.getInstance().start(qoskd)
    }

    private val ocxkokzoxkcjizx = MutableLiveData<String?>()
    val ridjsjif: LiveData<String?>
        get() = ocxkokzoxkcjizx

    suspend fun oqkoijijsdjisdji() {
        icjxvjvcxi.postValue(okcvjicvij.getDataDev().body())
    }

    private val bijvjinjijivb = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val woksdkoaskod = data?.get("campaign").toString()
            oxczkcx.postValue(woksdkoaskod)
        }

        override fun onConversionDataFail(error: String?) {
        }

        override fun onAppOpenAttribution(data: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(error: String?) {
        }
    }
    private val oxczkcx = MutableLiveData<String>()
    val wiojsdji: LiveData<String>
        get() = oxczkcx

    fun zaokoxcsi(civjx: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            civjx
        ) { okkovbjjivbcji: AppLinkData? ->
            okkovbjjivbcji?.let {
                val okxckokoxczji = okkovbjjivbcji.targetUri?.host.toString()
                eokskodaskd.edit().putString("deepSt", okxckokoxczji).apply()
            }
        }
    }

    private val cijzxcji = MutableLiveData<Misjijxuhuchzx>()
    val sdijsdi: LiveData<Misjijxuhuchzx>
        get() = cijzxcji

    fun axzxpxocz() {
        val rokekdf = AdvertisingIdClient(oozkzkkzx)
        rokekdf.start()
        val vocbjiv = rokekdf.info.id.toString()
        ocxkokzoxkcjizx.postValue(vocbjiv)
    }




}