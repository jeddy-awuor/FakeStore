package com.example.fakestoreapi.network

import retrofit2.http.GET



interface Productservice {
    @GET("/products")
   fun getProducts():`ProductsReponse\`
}