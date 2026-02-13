package com.phoenix.basket.domain.entity

import com.phoenix.user.domain.User


data class Basket(
    val debitcard : Card,
    val person : User,
//    val pizzas : Array<OrderedPizza>,
    val receiverAddress : UserAddress
)