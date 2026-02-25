package com.phoenix.pizza.domain

import kotlinx.serialization.Serializable
@Serializable
enum class PizzaSizeType {
    SMALL,
    MEDIUM,
    LARGE;
}

@Serializable
data class PizzaSize(
    val type: PizzaSizeType,
    val price : Int
)