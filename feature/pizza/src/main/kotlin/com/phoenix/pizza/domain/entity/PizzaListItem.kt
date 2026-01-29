package com.phoenix.pizza.domain.entity

import com.phoenix.pizza.domain.PizzaSize


data class PizzaListItem(
    val id : String,
    val name : String,
    val description: String,
    val img : String,
    val sizes : Array<PizzaSize>
)