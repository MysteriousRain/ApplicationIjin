package com.example.applicationijin.service

import com.example.applicationijin.model.GetIjinResponse
import com.example.applicationijin.model.ResponsePostData
import okhttp3.MultipartBody
import okhttp3.RequestBody
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


    @Multipart
    @Headers("X-Api-Key:7CEA5BD21C9B664D78E37276C91FAB02")
    @POST("api/ijin/add")
    fun addDataAndImage(@Part("kategori") kategori:RequestBody, @Part("dari") dari:RequestBody,
                        @Part("sampai") sampai:RequestBody, @Part("perihal") perihal:RequestBody, @Part("keterangan") keterangan:RequestBody,
                        @Part  file:MultipartBody.Part):Call<ResponsePostData>
}