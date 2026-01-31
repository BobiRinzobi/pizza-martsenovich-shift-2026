package com.phoenix.details.data.repository

import com.phoenix.details.data.converter.PizzaDetailsConverter
import com.phoenix.details.domain.entity.Pizza
import com.phoenix.details.domain.repository.PizzaDetailsRepository

class PizzaDetailsImpl (
    private val dataSource : PizzaDetalisApi,
    private val pizzaConverter: PizzaDetailsConverter
) : PizzaDetailsRepository {
    override suspend fun getPizzas(): List<Pizza> =
        dataSource.getPizzas().map { pizzaConverter.convert(it) }

}