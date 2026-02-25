package com.phoenix.pizza.presentation

import com.phoenix.pizza.domain.entity.PizzaListItem

sealed interface PizzaListState{
    data object Initial : PizzaListState
    data object Loading : PizzaListState
    data class Error(val message : String) : PizzaListState
    data class Content(val pizza : List<PizzaListItem>) : PizzaListState
}