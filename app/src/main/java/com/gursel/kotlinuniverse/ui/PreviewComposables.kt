package com.gursel.kotlinuniverse.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.gursel.kotlinuniverse.ui.screens.DetailsScreen
import com.gursel.kotlinuniverse.ui.screens.MainScreen
import com.gursel.kotlinuniverse.ui.theme.KotlinUniverseTheme

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainScreenPreview() {
    KotlinUniverseTheme {
        MainScreen(navController = rememberNavController())
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DetailsScreenPreview() {
    KotlinUniverseTheme {
        DetailsScreen(landmarkIndex = 0, navController = rememberNavController())
    }
}

