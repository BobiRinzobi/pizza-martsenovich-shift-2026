package com.phoenix.pizza.data.repository

import kotlinx.serialization.Serializable


@Serializable
data class CatalogResponse(
    val catalog: List<PizzaModel>,
    val success: Boolean,
    val reason: String? = null
)