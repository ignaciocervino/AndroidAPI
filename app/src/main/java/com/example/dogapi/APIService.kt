package com.example.dogapi

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

//Metodo para consumir la API
interface APIService {
    //Tipo de llamada
    @GET
    fun getDogsByBreeds(@Url url:String):Response<DogResponse>
}