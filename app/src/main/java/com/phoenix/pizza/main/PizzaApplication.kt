package com.phoenix.pizza.main

import android.app.Application
import com.phoenix.pizza.di.PizzaModule
import com.phoenix.pizza.di.network.networkModule
import org.koin.core.context.startKoin

class PizzaApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(
                networkModule,
                PizzaModule,

            )
        }
    }
}