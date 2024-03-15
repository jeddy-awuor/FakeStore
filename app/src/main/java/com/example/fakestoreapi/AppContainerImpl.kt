package com.example.fakestoreapi

class AppContainerImpl : AppContainer {
    override val productsRepository: ProductsRepository by lazy {
        ProductsRepositoryImpl()
    }
}