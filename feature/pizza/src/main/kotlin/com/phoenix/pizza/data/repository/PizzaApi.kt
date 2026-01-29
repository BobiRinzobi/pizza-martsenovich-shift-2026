package com.phoenix.pizza.data.repository

import com.phoenix.pizza.domain.entity.PizzaListItem
import retrofit2.http.GET

interface PizzaApi {
    @GET("/api/pizza/catalog")
    suspend fun getPizzas() : List<PizzaModel>
}