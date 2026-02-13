package com.phoenix.pizza.domain.usecase

import com.phoenix.pizza.domain.entity.PizzaListItem
import com.phoenix.pizza.domain.repository.PizzaListRepository

class GetPizzasUseCase(private val PizzaListrepository: PizzaListRepository ){
    suspend fun invoke() : List<PizzaListItem> =
        PizzaListrepository.getPizzas()

}