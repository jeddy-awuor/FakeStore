package com.example.fakestoreapi

import com.example.fakestoreapi.network.ProductsResponse
import com.example.fakestoreapi.network.Productservice

class ProductsRepositoryImpl(
    private val productService: Productservice
): ProductsRepository {
    override suspend fun getProducts(): ProductsResponse {
        return productService.getProducts()
    }
}