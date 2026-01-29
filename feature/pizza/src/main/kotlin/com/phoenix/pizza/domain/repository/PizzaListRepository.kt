package com.phoenix.pizza.domain.repository

import com.phoenix.pizza.domain.entity.PizzaListItem

interface PizzaListRepository {
    suspend fun getPizzas() : List<PizzaListItem>
}