package com.phoenix.pizza.domain

enum class PizzaSizeType {
    SMALL,
    MEDIUM,
    LARGE;
}

data class PizzaSize(
    val type: PizzaSizeType,
    val price : Int
)