package com.example.footbal_results_compose.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import dagger.hilt.android.AndroidEntryPoint


@Composable
fun ScoreScreen(navController: NavController) {


    Column(modifier = Modifier.fillMaxSize()) {
        Button(onClick = {
            navController.navigate(Screen.DetailsScreen.route)

        }) {

        }

    }


}