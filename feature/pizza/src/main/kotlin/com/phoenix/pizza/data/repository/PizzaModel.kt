package com.phoenix.pizza.data.repository

import com.phoenix.pizza.domain.PizzaSize

data class PizzaModel(
    val id : String,
    val name : String,
    val description: String,
    val img : String,
    val sizes : Array<PizzaSize>
)