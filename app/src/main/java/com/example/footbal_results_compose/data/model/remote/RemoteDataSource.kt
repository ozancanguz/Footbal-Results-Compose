package com.example.footbal_results_compose.data.model.remote

import com.example.footbal_results_compose.data.model.Scores
import com.example.footbal_results_compose.data.model.api.ScoresApi
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource@Inject constructor(private val scoresApi: ScoresApi) {


    suspend fun getScores(): Response<Scores> {

        return scoresApi.getScores()
    }
}