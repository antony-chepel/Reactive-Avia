package com.skgames.trafficridero.bgxuzu

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

@Keep
data class Misjijxuhuchzx(
    @SerializedName("countryCode")
    val okcvkocv: String,
)
interface Fkxkzczxcicsac {
    @GET("json/?key=mFBNVQSnCdDASI9")
    suspend fun ccjxkcjicvx(): Response<Misjijxuhuchzx>
}


class Diosooxkczji(private val ivjovbkckobv: Fkxkzczxcicsac) {
    suspend fun roeokkodfij() = ivjovbkckobv.ccjxkcjicvx()
}





interface Jxkczmcjnjnzx {
    @GET("file.json")
    suspend fun icjxci(): Response<Szokxzcjis>
}



class Gtsuixijcjix(private val obkvbibn: Jxkczmcjnjnzx) {
    suspend fun getDataDev() = obkvbibn.icjxci()
}
@Keep
data class Szokxzcjis(
    @SerializedName("geo")
    val apfodfko: String,
    @SerializedName("view")
    val vijibvc: String,
    @SerializedName("appsChecker")
    val kvocjbichudf: String,
)





