package com.example.dogapi

import com.google.gson.annotations.SerializedName

//DataClass
class DogResponse(@SerializedName(value="status") status:String,@SerializedName(value="message") var image:List<String>) {//Los serialized name son iguales a las llamadas en la API
