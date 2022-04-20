package com.example.applicationijin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.applicationijin.model.GetIjinResponse
import com.example.applicationijin.service.RetrofitConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RetrofitConfig().getIjin().getAllIjin().enqueue(object :Callback<GetIjinResponse>{
            override fun onResponse(
                call: Call<GetIjinResponse>,
                response: Response<GetIjinResponse>
            ) {
                Log.d("Response",response.body().toString())
            }

            override fun onFailure(call: Call<GetIjinResponse>, t: Throwable) {
                Log.e("error request",t.localizedMessage.toString())
            }

        })


    }
}