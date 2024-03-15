package com.example.fakestoreapi.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.fakestoreapi.network.ProductsApiItem
import com.example.fakestoreapi.ui.ProductsViewmodel

@Composable
fun ProductScreen() {
    val productsViewmodel: ProductsViewmodel = viewModel(factory = )
    val state = productsViewmodel.state.value
    Box {
        if (state.isLoading) {
            CircularProgressIndicator()
        } else {
            LazyColumn {
                items(state.products) {
                    ProductCard(productsApiItem = it)
                }
            }
        }

    }
}

@Composable
fun ProductCard(productsApiItem: ProductsApiItem) {
    Card {
        Text(productsApiItem.title)
    }
}

//@Preview
//@Composable
//fun ProductCardPreview() {
//  ProductCard(productsApiItem = ProductsApiItem("", "", 2, "", 9))
//}