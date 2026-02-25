package com.phoenix.details.data.converter

import com.phoenix.details.data.repository.PizzaModel
import com.phoenix.details.domain.entity.Pizza
import com.phoenix.pizza.domain.PizzaDough
import com.phoenix.pizza.domain.PizzaIngredient
import com.phoenix.pizza.domain.PizzaSize
import kotlin.String

class PizzaDetailsConverter {

    fun convert(model : PizzaModel) : Pizza =
        Pizza(
            id = model.id,
            name = model.name,
            description = model.description,
            img = model.img,
            sizes = model.sizes,
            allergens = model.allergens,
            calories = model.calories,
            carbohydrates = model.carbohydrates,
            doughs = model.doughs,
            ingredients = model.ingredients,
            isGlutenFree =  model.isGlutenFree,
            isHit = model.isHit,
            isNew = model.isNew,
            isVegetarian = model.isVegetarian,
            protein = model.protein,
            sodium = model.sodium,
            toppings = model.toppings,
            totalFat = model.totalFat
        )
}