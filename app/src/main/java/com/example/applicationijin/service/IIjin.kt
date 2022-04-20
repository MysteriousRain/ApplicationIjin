package com.example.applicationijin.service

import com.example.applicationijin.model.GetIjinResponse
import com.example.applicationijin.model.ResponsePostData
import retrofit2.Call
import retrofit2.http.*


interface IIjin {


    @Headers("X-Api-Key:7CEA5BD21C9B664D78E37276C91FAB02")
    @GET("api/ijin/all")
    fun getAllIjin(): Call<GetIjinResponse>

    @FormUrlEncoded
    @Headers("X-Api-Key:7CEA5BD21C9B664D78E37276C91FAB02")
    @POST("api/ijin/add")
    fun addDataForm(@Field("kategori") kategori:String, @Field("dari") dari:String,
                    @Field("sampai") sampai:String, @Field("perihal") perihal:String, @Field("keterangan") keterangan:String):Call<ResponsePostData>
}