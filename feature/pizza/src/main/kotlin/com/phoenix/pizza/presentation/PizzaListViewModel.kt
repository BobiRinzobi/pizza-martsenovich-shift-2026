package com.phoenix.pizza.presentation

import androidx.lifecycle.viewModelScope
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.phoenix.pizza.domain.entity.PizzaListItem
import com.phoenix.pizza.domain.usecase.GetPizzasUseCase
import kotlinx.coroutines.launch

class PizzaListViewModel(
    private val getPizzasUseCase: GetPizzasUseCase,

) : ViewModel() {
    private val _state = MutableLiveData<PizzaListState>(PizzaListState.Initial)
    val state: LiveData<PizzaListState> = _state

    fun LoadData() {

        if (_state.value is PizzaListState.Loading || _state.value is PizzaListState.Content){
            return
        }

        _state.value = PizzaListState.Loading

        viewModelScope.launch{
            try{
                val PizzaListItems = getPizzasUseCase.invoke()
                _state.value = PizzaListState.Content(
                    pizza = PizzaListItems
                )

            }catch (e : Exception){
                _state.value = PizzaListState.Error(messaage = e.message.orEmpty())
            }

        }


    }
}