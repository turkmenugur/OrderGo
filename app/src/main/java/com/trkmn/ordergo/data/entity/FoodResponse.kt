package com.trkmn.ordergo.data.entity

import com.google.gson.annotations.SerializedName

data class FoodResponse(
    @SerializedName("yemekler")
    val yemekler: List<Food>, // Yemek nesnelerinden oluşan liste

    @SerializedName("success")
    val success: Int // İşlemin başarı durumunu gösteren flag (1 = başarılı)
)
