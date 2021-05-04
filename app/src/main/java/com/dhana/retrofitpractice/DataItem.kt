package com.dhana.retrofitpractice


import com.google.gson.annotations.SerializedName


data class DataItem(
    @SerializedName("body")
    var body: String = "",
    @SerializedName("id")
    var id: Int = 0,
    @SerializedName("title")
    var title: String = "",
    @SerializedName("userId")
    var userId: Int = 0
)