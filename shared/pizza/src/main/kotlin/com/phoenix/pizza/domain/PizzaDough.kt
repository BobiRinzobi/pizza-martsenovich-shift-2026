package com.phoenix.pizza.domain
import kotlinx.serialization.Serializable

@Serializable
enum class PizzaDoughType {
    THIN, THICK
}

@Serializable
data class PizzaDough (
    val type : PizzaDoughType,
    val price : Int
)