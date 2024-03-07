package com.example.fakestoreapi.network

import retrofit2.http.GET

interface productservice {
    @GET("/products")
   fun getproducts():productsapi
}