package com.gursel.kotlinuniverse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.gursel.kotlinuniverse.ui.screens.DetailsScreen
import com.gursel.kotlinuniverse.ui.screens.MainScreen
import com.gursel.kotlinuniverse.ui.theme.KotlinUniverseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlinUniverseTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "main_screen"
                    ) {
                        composable("main_screen") {
                            MainScreen(navController)
                        }

                        composable(
                            route = "details_screen/{landmarkIndex}",
                            arguments = listOf(
                                navArgument("landmarkIndex") {
                                    type = NavType.IntType
                                }
                            )
                        ) { backStackEntry ->
                            val index = backStackEntry.arguments?.getInt("landmarkIndex") ?: 0
                            DetailsScreen(landmarkIndex = index, navController = navController)
                        }
                    }
                }
            }
        }
    }
}

