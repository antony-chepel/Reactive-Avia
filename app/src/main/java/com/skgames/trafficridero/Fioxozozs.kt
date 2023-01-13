package com.skgames.trafficridero

import android.app.Application
import android.content.Context
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import com.skgames.trafficridero.bgxuzu.cooxijc
import com.skgames.trafficridero.bgxuzu.wosidjas
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class Fioxozozs: Application() {

    companion object {
        const val xuchzhuzxchucz = "2e1e845f-82fc-41db-b1c8-a7ebf59241a2"
        var okdsoskdadji: String? = "main_id"

        var dijsfjieji: String? = "instID"
        val xuzhczx: String = "myID"



    }

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(xuchzhuzxchucz)




        val tcxyxchu = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val dokaskodji = getSharedPreferences("PREFS_NAME", 0)

        val xczjnc = MyTracker.getTrackerParams()
        val qoksdjijix = MyTracker.getTrackerConfig()
        val kmcxmkmxkc = MyTracker.getInstanceId(this)
        qoksdjijix.isTrackingLaunchEnabled = true
        val eokkof = UUID.randomUUID().toString()

        if (dokaskodji.getBoolean("my_first_time", true)) {
            xczjnc.setCustomUserId(eokkof)
            tcxyxchu.edit().putString(xuzhczx, eokkof).apply()
            tcxyxchu.edit().putString(dijsfjieji, kmcxmkmxkc).apply()
            dokaskodji.edit().putBoolean("my_first_time", false).apply()
        } else {
            val ovkvckoijjiijcv = tcxyxchu.getString(xuzhczx, eokkof)
            xczjnc.setCustomUserId(ovkvckoijjiijcv)
        }
        MyTracker.initTracker("39629875222152097801", this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@Fioxozozs)
            modules(
                listOf(
                    wosidjas, cooxijc
                )
            )
        }
    }
}