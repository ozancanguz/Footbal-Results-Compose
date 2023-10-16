package com.example.footbal_results_compose.view

import androidx.compose.runtime.Composable
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {

    // nav controller
    val navController= rememberNavController()


    NavHost(navController = navController, startDestination = Screen.ScoreScreen.route){

        composable(route=Screen.ScoreScreen.route){
            ScoreScreen(navController)
        }

        composable(route=Screen.DetailsScreen.route){
            DetailScreen(navController)
        }

    }



}