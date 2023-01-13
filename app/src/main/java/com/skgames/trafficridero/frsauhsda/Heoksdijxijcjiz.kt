package com.skgames.trafficridero.frsauhsda

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import com.skgames.trafficridero.Fioxozozs.Companion.okdsoskdadji
import com.skgames.trafficridero.Fioxozozs.Companion.dijsfjieji
import com.skgames.trafficridero.databinding.MvicuvhchucBinding
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class Heoksdijxijcjiz : AppCompatActivity() {
    var aplxlclpxlpzc = ""
    private var vicjbic = false
    private lateinit var kxmzcjizxi: MvicuvhchucBinding
    lateinit var eijjifd: WebView

    private val lxlcozxkczxjczxjizxcji by viewModel<Jixuzijjicas>(
        named("BeamModel")
    )
    private var siajsad: ValueCallback<Array<Uri>>? = null
    private var vcoxcv: String? = null
    private val eokwokodskoa = 1



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        kxmzcjizxi = MvicuvhchucBinding.inflate(layoutInflater)
        setContentView(kxmzcjizxi.root)
        eijjifd = kxmzcjizxi.uxzis
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(eijjifd, true)
        lxlcozxkczxjczxjizxcji.rokeokokdf(eijjifd)


        eijjifd.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (lxlcozxkczxjczxjizxcji.eowdsa(url)) {

                        val okcoxvijdjisdji = Intent(Intent.ACTION_VIEW)
                        okcoxvijdjisdji.data = Uri.parse(url)
                        startActivity(okcoxvijdjisdji)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                ofkkckovxko(url)
            }


            override fun onReceivedError(
                view: WebView?,
                errorCode: Int,
                description: String?,
                failingUrl: String?
            ) {
                Toast.makeText(this@Heoksdijxijcjiz, description, Toast.LENGTH_SHORT).show()
            }
        }

        eijjifd.webChromeClient = Tiokckoxzoks()
        eijjifd.loadUrl(ixjcjisjiacji())
    }

    override fun onActivityResult(cvijcxji: Int, qiosdo: Int, kocvkoxcv: Intent?) {

        if (cvijcxji != eokwokodskoa || siajsad == null) {
            super.onActivityResult(cvijcxji, qiosdo, kocvkoxcv)
            return
        }
        var ockdodfjfjid: Array<Uri>? = null

        if (qiosdo == RESULT_OK) {
            if (kocvkoxcv == null) {
                if (vcoxcv != null) {
                    ockdodfjfjid = arrayOf(Uri.parse(vcoxcv))
                }
            } else {
                val tixjzhuxzhzx = kocvkoxcv.dataString
                if (tixjzhuxzhzx != null) {
                    ockdodfjfjid = arrayOf(Uri.parse(tixjzhuxzhzx))
                }
            }
        }
        siajsad!!.onReceiveValue(ockdodfjfjid)
        siajsad = null
        return
    }


    private fun ixjcjisjiacji(): String {

        val ogkfkdogkof = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)


        val okxckz = getSharedPreferences(
            "SHARED_PREF",
            Context.MODE_PRIVATE
        )
        val qokokw = okxckz.getString("link", null)
        val sdijsd = okxckz.getString("WebInt", null)
        val rokfkggf = okxckz.getString(okdsoskdadji, null)

        val okkokbkobjijijvicb = okxckz.getString(dijsfjieji, null)




        when (sdijsd) {
            "campaign" -> {
                lxlcozxkczxjczxjizxcji.xiozkcijxczji(rokfkggf.toString())
            }
            "deepLink" -> {
                lxlcozxkczxjczxjizxcji.xiozkcijxczji(rokfkggf.toString())
            }
            "deepLinkNOApps" -> {
                lxlcozxkczxjczxjizxcji.xiozkcijxczji(okkokbkobjijijvicb.toString())
            }
            "geo" -> {
                lxlcozxkczxjczxjizxcji.xiozkcijxczji(okkokbkobjijijvicb.toString())
            }

        }
        Log.d("lolo", "link is ${qokokw}")
        return ogkfkdogkof.getString("SAVED_URL", qokokw).toString()
    }
    override fun onBackPressed() {

        if (eijjifd.canGoBack()) {
            if (vicjbic) {
                eijjifd.stopLoading()
                eijjifd.loadUrl(aplxlclpxlpzc)
            }
            this.vicjbic = true
            eijjifd.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                vicjbic = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }





    inner class Tiokckoxzoks : WebChromeClient() {

        override fun onShowFileChooser(
            view: WebView?,
            cxvo: ValueCallback<Array<Uri>>?,
            sodkskoadosakd: FileChooserParams?
        ): Boolean {
            siajsad?.onReceiveValue(null)
            siajsad = cxvo
            var giogfokfgdfjicxvnjixc: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (giogfokfgdfjicxvnjixc!!.resolveActivity(packageManager) != null) {
                var oeoewjijiwji: File? = null
                try {
                    oeoewjijiwji = eijdofkskdskof()
                    giogfokfgdfjicxvnjixc.putExtra("PhotoPath", vcoxcv)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (oeoewjijiwji != null) {
                    vcoxcv = "file:" + oeoewjijiwji.absolutePath
                    giogfokfgdfjicxvnjixc.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(oeoewjijiwji)
                    )
                } else {
                    giogfokfgdfjicxvnjixc = null
                }
            }
            val spsooskixjc = Intent(Intent.ACTION_GET_CONTENT)
            spsooskixjc.addCategory(Intent.CATEGORY_OPENABLE)
            spsooskixjc.type = "image/*"
            val ucyxygyxcvgycvx: Array<Intent?> =
                giogfokfgdfjicxvnjixc?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val onkknbkonbjbn = Intent(Intent.ACTION_CHOOSER)
            onkknbkonbjbn.putExtra(Intent.EXTRA_INTENT, spsooskixjc)
            onkknbkonbjbn.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            onkknbkonbjbn.putExtra(Intent.EXTRA_INITIAL_INTENTS, ucyxygyxcvgycvx)
            startActivityForResult(onkknbkonbjbn, eokwokodskoa)
            return true
        }

        fun eijdofkskdskof(): File? {
            val ogkgkofo = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val riojfjijgfjkovcko = "JPEG_" + ogkgkofo + "_"
            val sossksoksa = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                riojfjijgfjkovcko,
                ".jpg",
                sossksoksa
            )
        }
    }



    fun ofkkckovxko(qokosd: String?) {
        if (!qokosd!!.contains("t.me")) {

            if (aplxlclpxlpzc == "") {
                aplxlclpxlpzc = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    qokosd
                ).toString()

                val igjhjijig =
                    getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val mnbij = igjhjijig.edit()
                mnbij.putString("SAVED_URL", qokosd)
                mnbij.apply()
            }
        }
    }


}

