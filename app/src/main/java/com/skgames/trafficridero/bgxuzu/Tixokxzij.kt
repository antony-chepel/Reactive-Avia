package com.skgames.trafficridero.bgxuzu

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.skgames.trafficridero.R
import com.skgames.trafficridero.mkioxccxhu.Foxozijcsuha
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class Tixokxzij : Fragment() {
    lateinit var cvcvkoocvocv: String
    private lateinit var ockxxcvo: Context

    val sdsij: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var sdsdjisd: String

    lateinit var xcijxc: String
    val ocvkkxcvxvpc by activityViewModel<Foxozijcsuha>(named("MainModel"))




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.rwisidjajisdx, container, false)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ocvkkxcvxvpc.ridjsjif.observe(viewLifecycleOwner) {
            if (it != null) {
                val main = it.toString()
                sdsij.edit().putString("mainId", main).apply()
            }
        }

        ocvkkxcvxvpc.eijsdajiasd.observe(viewLifecycleOwner) {
            if (it != null) {

                sdsdjisd = it.apfodfko
                xcijxc = it.kvocjbichudf
                cvcvkoocvocv = it.vijibvc

                sdsij.edit().putString("countryDev", sdsdjisd).apply()
                sdsij.edit().putString("apps", xcijxc).apply()
                sdsij.edit().putString("wv", cvcvkoocvocv).apply()

                findNavController().navigate(R.id.ookdkofs)
            }
        }
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        ockxxcvo = context
    }

}