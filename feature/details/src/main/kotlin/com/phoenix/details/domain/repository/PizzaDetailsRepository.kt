package com.phoenix.details.domain.repository

import com.phoenix.details.domain.entity.Pizza

interface PizzaDetailsRepository {
    suspend fun getPizzas() : List<Pizza>
}