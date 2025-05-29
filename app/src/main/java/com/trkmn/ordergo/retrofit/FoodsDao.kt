package com.trkmn.ordergo.retrofit

import retrofit2.http.GET

interface FoodsDao {
    @GET("yemekler/tumYemekleriGetir.php")
    suspend fun loadFoods(): FoodResponse
}