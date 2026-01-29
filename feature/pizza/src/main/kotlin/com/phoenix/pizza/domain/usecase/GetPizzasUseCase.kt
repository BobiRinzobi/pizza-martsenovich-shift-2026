package com.phoenix.pizza.domain.usecase

import com.phoenix.pizza.domain.entity.PizzaListItem
import com.phoenix.pizza.domain.repository.PizzaListRepository

class GetPizzasUseCase(private val repository: PizzaListRepository ){
    suspend operator fun invoke() : List<PizzaListItem>
    {
        return repository.getPizzas()
    }
}