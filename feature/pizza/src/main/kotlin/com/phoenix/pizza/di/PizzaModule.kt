package com.phoenix.pizza.di

import com.phoenix.pizza.data.converter.PizzaConverter
import com.phoenix.pizza.data.repository.PizzaApi
import com.phoenix.pizza.data.repository.PizzaListRepositoryImpl
import com.phoenix.pizza.domain.repository.PizzaListRepository
import com.phoenix.pizza.domain.usecase.GetPizzasUseCase
import com.phoenix.pizza.presentation.PizzaListViewModel
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.viewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module
import retrofit2.Retrofit

val PizzaModule = module {
    single { get<Retrofit>().create(PizzaApi::class.java) }
    factoryOf(::PizzaListRepositoryImpl) bind PizzaListRepository::class
    factoryOf(::PizzaConverter)
    factoryOf(::GetPizzasUseCase)
    viewModelOf(::PizzaListViewModel)

}