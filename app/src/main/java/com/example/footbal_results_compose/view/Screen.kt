package com.example.footbal_results_compose.view

sealed class Screen(val route:String){

    object ScoreScreen:Screen("score_screen")
    object DetailsScreen:Screen("detail_screen")


}
