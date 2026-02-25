package com.phoenix.pizza.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.phoenix.pizza.presentation.PizzaListViewModel
import com.phoenix.pizza.ui.PizzaListScreen
import com.phoenix.pizza.ui.theme.PizzaTheme
import org.koin.androidx.compose.koinViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PizzaTheme {
                val viewModel: PizzaListViewModel = koinViewModel()

                PizzaListScreen(
                    PizzaListViewModel = viewModel,
                    modifier = Modifier.fillMaxSize()
                )

            }
        }
    }
}