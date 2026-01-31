package com.phoenix.details.domain.usecase

import com.phoenix.details.domain.entity.Pizza
import com.phoenix.details.domain.repository.PizzaDetailsRepository

class GetPizzaDetailsUseCase(private  val repository: PizzaDetailsRepository) {

    suspend operator fun invoke() : List<Pizza> {
        return repository.getPizzas()
    }

}