package com.phoenix.details.data.repository

import retrofit2.http.GET

interface PizzaDetalisApi {
    @GET("/api/pizza/catalog")
    suspend fun getPizzas() : List<PizzaModel>
}