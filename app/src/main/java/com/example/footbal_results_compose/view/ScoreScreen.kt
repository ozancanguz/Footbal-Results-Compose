package com.example.footbal_results_compose.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.footbal_results_compose.viewmodels.ScoreScreenViewModel
import dagger.hilt.android.AndroidEntryPoint


@Composable
fun ScoreScreen(navController: NavController) {


    // init viewmodel

    val scoreScreenViewModel:ScoreScreenViewModel= hiltViewModel()

    // collect state
    val scoreList by scoreScreenViewModel.scoreList.collectAsState()

    // call viewModel
    scoreScreenViewModel.getScoreList()

    ScoreList(scoreList = scoreList.result)




}