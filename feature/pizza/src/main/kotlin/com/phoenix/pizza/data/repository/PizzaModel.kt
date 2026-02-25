package com.phoenix.pizza.data.repository

import com.phoenix.pizza.domain.PizzaDough
import com.phoenix.pizza.domain.PizzaIngredient
import com.phoenix.pizza.domain.PizzaSize
import kotlinx.serialization.Serializable

@Serializable
data class PizzaModel(
    val id : String,
    val name : String,
    val description: String,
    val img : String,
    val sizes : Array<PizzaSize>,
    val allergens : Array<String>,
    val calories : Int,
    val carbohydrates : String,
    val doughs : Array<PizzaDough>,
    val ingredients : Array<PizzaIngredient>,
    val isGlutenFree : Boolean,
    val isHit : Boolean,
    val isNew : Boolean,
    val isVegetarian : Boolean,
    val protein : String,
    val sodium : String,
    val toppings : Array<PizzaIngredient>,
    val totalFat : String
)