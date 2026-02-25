package com.phoenix.pizza.domain

import kotlinx.serialization.Serializable
@Serializable
enum class PizzaIngredientType{
    PINEAPPLE,
    MOZZARELLA,
    PEPERONI,
    GREEN_PEPPER,
    MUSHROOMS,
    BASIL,
    CHEDDAR,
    PARMESAN,
    FETA,
    HAM,
    PICKLE,
    TOMATO,
    BACON,
    ONION,
    CHILE,
    SHRIMPS,
    CHICKEN_FILLET,
    MEATBALLS
}

@Serializable
data class PizzaIngredient(
    val img : String,
    val price : Int,
    val type : PizzaIngredientType
)