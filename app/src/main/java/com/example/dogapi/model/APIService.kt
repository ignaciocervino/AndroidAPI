package com.example.dogapi.model

import com.example.dogapi.DogsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

//Metodo para consumir la API
interface APIService {
    //Tipo de llamada
    @GET
    suspend fun getDogsByBreeds(@Url url:String):Response<DogsResponse>
}