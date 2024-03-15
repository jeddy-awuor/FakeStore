package com.example.fakestoreapi

import com.example.fakestoreapi.network.ProductsResponse

interface ProductsRepository {
    suspend fun getProducts(): ProductsResponse
}