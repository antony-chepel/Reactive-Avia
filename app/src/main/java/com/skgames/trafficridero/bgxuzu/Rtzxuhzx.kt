package com.skgames.trafficridero.bgxuzu
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.skgames.trafficridero.R
import com.skgames.trafficridero.mkioxccxhu.Foxozijcsuha


import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class Rtzxuhzx : Fragment() {
    val sosdoksdko: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var kxzijc: String
    private lateinit var dosijsdji: Context
    val xicjjxci by activityViewModel<Foxozijcsuha>(named("MainModel"))


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val coixjvivxc = sosdoksdko.getString("apps", null)
        val sdsh = sosdoksdko.getString("appCamp", null)

        if (coixjvivxc=="1" &&sdsh == null) {
            xicjjxci.oosjidjiijxc(dosijsdji)
            xicjjxci.wiojsdji.observe(viewLifecycleOwner) {

                if (it != null) {
                    kxzijc = it.toString()
                    sosdoksdko.edit().putString("appCamp", kxzijc).apply()
                    findNavController().navigate(R.id.action_beeeeforFiiilFragment_to_fiiilttterFragment)
                }
            }
        } else {
            findNavController().navigate(R.id.action_beeeeforFiiilFragment_to_fiiilttterFragment)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.buvhusd, container, false)
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        dosijsdji = context
    }

}