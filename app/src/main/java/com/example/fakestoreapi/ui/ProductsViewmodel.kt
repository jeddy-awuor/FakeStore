package com.example.fakestoreapi.ui

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fakestoreapi.ProductsRepository
import com.example.fakestoreapi.network.ProductsApiItem
import kotlinx.coroutines.launch

class ProductsViewmodel(private val productRepository: ProductsRepository) : ViewModel() {

    private val _state = mutableStateOf(ProductState())
    val state: State<ProductState> = _state
    fun getProducts() {
        viewModelScope.launch {
            _state.value = _state.value.copy(
                isLoading = true
            )

            val products = productRepository.getProducts()

            _state.value = _state.value.copy(
                isLoading = false,
                products = products
            )

        }
    }
}

data class ProductState(
    val error: String = "",
    val isLoading: Boolean = false,
    val products: List<ProductsApiItem> = emptyList()
)