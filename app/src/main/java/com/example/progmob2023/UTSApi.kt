package com.example.progmob2023

import retrofit2.Call
import retrofit2.http.*
import retrofit2.http.GET

interface UTSApi {
    @GET("https://kpsi.fti.ukdw.ac.id/api/progmob/mhs/72210448")
    fun getAllMahasiswa(): Call<ArrayList<PostResponse>>

    @POST("https://kpsi.fti.ukdw.ac.id/api/progmob/mhs/create")
    fun insertMahasiswa(@Body mahasiswa: MainUts): Call<Void>

}
