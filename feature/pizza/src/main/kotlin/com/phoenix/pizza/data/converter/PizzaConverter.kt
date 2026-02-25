package com.phoenix.pizza.data.converter

import com.phoenix.pizza.data.repository.PizzaModel
import com.phoenix.pizza.domain.PizzaSize
import com.phoenix.pizza.domain.entity.PizzaListItem
import kotlin.String

class PizzaConverter{

    fun convert(model : PizzaModel) : PizzaListItem =
        PizzaListItem(
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