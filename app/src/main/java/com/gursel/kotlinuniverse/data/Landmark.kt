package com.gursel.kotlinuniverse.data

data class Landmark(
    val name: String,
    val country: String,
    val imageRes: Int
)

val landmarksList = listOf(
    Landmark("Pisa", "Italy", android.R.drawable.ic_dialog_info),
    Landmark("Colosseum", "Italy", android.R.drawable.ic_dialog_info),
    Landmark("Eiffel", "France", android.R.drawable.ic_dialog_info),
    Landmark("London Bridge", "UK", android.R.drawable.ic_dialog_info)
)

