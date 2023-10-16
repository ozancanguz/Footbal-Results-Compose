package com.example.footbal_results_compose.data.model.api

import com.example.footbal_results_compose.data.model.Scores
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface ScoresApi {


    @GET("results?data.league=super-lig")
    @Headers("authorization: apikey 2xAW88zA1iemGAxzWMNumI:47IyS3uICCasjqzWaFtxnn"
        , "content-type: application/json")
    suspend fun getScores(): Response<Scores>


}