package iot.lab.qrdetails.api


import iot.lab.qrdetails.util.Constants
import iot.lab.qrdetails.util.Constants.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: SimpleApi by lazy {
        retrofit.create(SimpleApi::class.java)
    }

    private val retrofitEvent by lazy {
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL_EVENT)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val apiEvent : SimpleApi by lazy {
        retrofitEvent.create(SimpleApi::class.java)
    }

}