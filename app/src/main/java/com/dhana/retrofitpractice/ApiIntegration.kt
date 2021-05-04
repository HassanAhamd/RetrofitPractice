package com.dhana.retrofitpractice

import retrofit2.Call
import retrofit2.http.GET

interface ApiIntegration {

    @GET("posts")
    fun getData(): Call<List<DataItem>>
}