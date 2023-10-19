package com.example.progmob2023

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "https://kpsi.fti.ukdw.ac.id/api/progmob/mhs/72210448"
    val instance:UTSApi by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retrofit.create(UTSApi::class.java)
    }
}