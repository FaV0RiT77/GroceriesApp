package com.example.groceriesapp

object Repository {
    val groceryName = mapOf(
        GroceryId.LEMONADE to "Lemonade",
        GroceryId.FRUITS to "Fruits",
        GroceryId.VEGETABLES to "Vegetables",
        GroceryId.PASTA to "Pasta",
        GroceryId.DAIRY to "Dairy",
        GroceryId.BREAD to "Bread",
        GroceryId.DRINKS to "Drinks",
        GroceryId.ALCOHOL to "Alcohol",
        GroceryId.MEDS to "Meds",
        GroceryId.HYGIENE to "Hygiene",
        GroceryId.SWEETS to "Sweets",
        GroceryId.MEAT to "Meat",
        GroceryId.PRESERVES to "Preserves",
        GroceryId.CARE to "Care"
    )

    val icons = mapOf(
        GroceryId.LEMONADE to R.drawable.category,
        GroceryId.FRUITS to R.drawable.category,
        GroceryId.VEGETABLES to R.drawable.category,
        GroceryId.PASTA to R.drawable.category,
        GroceryId.DAIRY to R.drawable.category,
        GroceryId.BREAD to R.drawable.category,
        GroceryId.DRINKS to R.drawable.category,
        GroceryId.ALCOHOL to R.drawable.category,
        GroceryId.MEDS to R.drawable.category,
        GroceryId.HYGIENE to R.drawable.category,
        GroceryId.SWEETS to R.drawable.category,
        GroceryId.MEAT to R.drawable.category,
        GroceryId.PRESERVES to R.drawable.category,
        GroceryId.CARE to R.drawable.category
    )
}