package com.phoenix.pizza.data.repository

import com.phoenix.pizza.data.converter.PizzaConverter
import com.phoenix.pizza.domain.entity.PizzaListItem
import com.phoenix.pizza.domain.repository.PizzaListRepository

class PizzaListRepositoryImpl (
    private val dataSource : PizzaApi,
    private val pizzaConverter: PizzaConverter
) : PizzaListRepository {
    override suspend fun getPizzas(): List<PizzaListItem> =
        dataSource.getPizzas().catalog.map { pizzaConverter.convert(it) }

}