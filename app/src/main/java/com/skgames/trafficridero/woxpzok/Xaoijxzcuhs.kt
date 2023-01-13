package com.skgames.trafficridero.woxpzok

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

class Xaoijxzcuhs : Fragment() {
    lateinit var rijdifjidf: String
    val fijfdijdf by activityViewModel<Foxozijcsuha>(named("MainModel"))

    val sodkokwdokwod: SharedPreferences by inject(named("SharedPreferences"))
    private lateinit var zoxijajix: Context




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fijfdijdf.ixzjijci.observe(viewLifecycleOwner) {
            if (it!=null) {
                rijdifjidf = it.okcvkocv
                sodkokwdokwod.edit().putString("country", rijdifjidf).apply()
                findNavController().navigate(R.id.jucxijds)
            }
        }
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        zoxijajix = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.mixzoijsa, container, false)
    }

}