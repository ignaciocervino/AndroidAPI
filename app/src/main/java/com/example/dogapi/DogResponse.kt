package com.example.dogapi

import com.google.gson.annotations.SerializedName

//DataClass
data class DogsResponse(
    @SerializedName("status") var status: String,
    @SerializedName("message") var images: List<String>
) //Los serialized name son iguales a las llamadas en la API
