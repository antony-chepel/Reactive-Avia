package com.skgames.trafficridero.frsauhsda

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.skgames.trafficridero.R
import com.skgames.trafficridero.mkioxccxhu.Foxozijcsuha
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named

class Gfesrxuzucisjsa : Fragment() {
    private lateinit var rijjisao: Context
    val xcijiscakoas by activityViewModel<Foxozijcsuha>(named("MainModel"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.mkovcijcv, container, false)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        xcijiscakoas.zaokoxcsi(rijjisao)

        findNavController().navigate(R.id.rokdkosf)

    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        rijjisao=context
    }
}