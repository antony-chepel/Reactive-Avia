package com.skgames.trafficridero.bgxuzu

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.skgames.trafficridero.frsauhsda.Jixuzijjicas
import com.skgames.trafficridero.mkioxccxhu.Foxozijcsuha
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val cooxijc = module {

    single  <Jxkczmcjnjnzx> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(Jxkczmcjnjnzx::class.java)
    }

    single <Fkxkzczxcicsac> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(Fkxkzczxcicsac::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://brillianirid.live/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        Diosooxkczji(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        Gtsuixijcjix(get(named("HostInter")))
    }
    single{
        xzcjizxcji()
    }
    single (named("SharedPreferences")) {
        fidjjdf(androidApplication())
    }
}

fun fidjjdf(oxkz: Application): SharedPreferences {
    return oxkz.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun xzcjizxcji(): Gson {
    return GsonBuilder().create()
}

val wosidjas = module {
    viewModel (named("MainModel")){
        Foxozijcsuha((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        Jixuzijjicas(get())
    }
}
