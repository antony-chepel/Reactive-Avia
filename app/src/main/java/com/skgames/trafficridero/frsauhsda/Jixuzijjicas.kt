package com.skgames.trafficridero.frsauhsda

import android.app.Application
import android.content.pm.PackageManager
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.lifecycle.ViewModel
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject

class Jixuzijjicas(application: Application): ViewModel() {

    val ijxcjixxzuhs = application.packageManager




    fun rokeokokdf(rokd: WebView): WebSettings{
        val odkkockoxv = rokd.settings
        odkkockoxv.javaScriptEnabled = true
        odkkockoxv.allowFileAccess = true
        odkkockoxv.setSupportMultipleWindows(false)
        odkkockoxv.userAgentString = odkkockoxv.userAgentString.replace("; wv", "")
        odkkockoxv.javaScriptCanOpenWindowsAutomatically = true
        odkkockoxv.setSupportZoom(true)
        odkkockoxv.pluginState = WebSettings.PluginState.ON
        odkkockoxv.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        odkkockoxv.setAppCacheEnabled(true)
        odkkockoxv.domStorageEnabled = true
        odkkockoxv.allowFileAccess = true
        odkkockoxv.allowContentAccess = true
        odkkockoxv.useWideViewPort = true
        odkkockoxv.allowContentAccess = true
        odkkockoxv.mediaPlaybackRequiresUserGesture = false
        odkkockoxv.loadWithOverviewMode = true
        odkkockoxv.displayZoomControls = false
        odkkockoxv.builtInZoomControls = true




        return odkkockoxv
    }

    fun xiozkcijxczji(zoxk: String) {
        OneSignal.setExternalUserId(
            zoxk,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(fodkkodfg: JSONObject) {
                    try {
                        if (fodkkodfg.has("push") && fodkkodfg.getJSONObject("push").has("success")) {
                            val fpllplpcv = fodkkodfg.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $fpllplpcv"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (fodkkodfg.has("email") && fodkkodfg.getJSONObject("email").has("success")) {
                            val cijxvjixchuds =
                                fodkkodfg.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $cijxvjixchuds"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (fodkkodfg.has("sms") && fodkkodfg.getJSONObject("sms").has("success")) {
                            val lxckmcmkzxcmij = fodkkodfg.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $lxckmcmkzxcmij"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }

    fun eowdsa(civj: String): Boolean {
        try {
            ijxcjixxzuhs.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }





}