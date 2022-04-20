package com.example.applicationijin.service

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class RetrofitConfig
{

    fun getInterceptor():OkHttpClient{
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY
        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()
        return okHttpClient


    }

    fun getRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl("http://192.168.43.6/cicool/")
            .client(getInterceptor())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getIjin() = getRetrofit().create(IIjin::class.java)


}