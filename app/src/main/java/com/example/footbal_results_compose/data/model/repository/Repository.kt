package com.example.footbal_results_compose.data.model.repository

import com.example.footbal_results_compose.data.model.remote.RemoteDataSource
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class Repository@Inject constructor(remoteDataSource: RemoteDataSource) {

    val remote=remoteDataSource
}