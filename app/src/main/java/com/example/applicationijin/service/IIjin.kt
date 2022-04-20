package com.example.applicationijin.service

import com.example.applicationijin.model.GetIjinResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers


interface IIjin {


    @Headers("X-Api-Key:7CEA5BD21C9B664D78E37276C91FAB02")
    @GET("api/ijin/all")
    fun getAllIjin(): Call<GetIjinResponse>
}