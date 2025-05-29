package com.trkmn.ordergo.retrofit

import com.trkmn.ordergo.data.entity.FoodResponse
import retrofit2.http.GET

interface FoodsDao {
    @GET("yemekler/tumYemekleriGetir.php")
    suspend fun loadFoods(): FoodResponse


}