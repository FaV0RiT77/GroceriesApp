package com.example.groceriesapp

import androidx.annotation.DrawableRes

data class Grocery(
    val name: String,
    @DrawableRes val icon: Int
)
