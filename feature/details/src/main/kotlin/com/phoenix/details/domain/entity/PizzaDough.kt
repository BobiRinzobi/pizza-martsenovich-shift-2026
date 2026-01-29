package com.phoenix.details.domain.entity

enum class PizzaDoughType {
    THIN, THICK
}

data class PizzaDough (
    val type : PizzaDoughType,
    val price : Int
)