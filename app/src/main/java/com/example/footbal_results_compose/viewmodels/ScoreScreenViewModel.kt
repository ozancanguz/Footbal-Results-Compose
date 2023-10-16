package com.example.footbal_results_compose.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.footbal_results_compose.data.model.Scores
import com.example.footbal_results_compose.data.model.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ScoreScreenViewModel@Inject constructor(val repository: Repository):ViewModel() {



    private val _scoreList= MutableStateFlow(Scores(emptyList(),false))
    val scoreList:StateFlow<Scores>
        get() = _scoreList


    fun getScoreList(){
        viewModelScope.launch {
            val response=repository.remote.getScores()
            if(response.isSuccessful){
                _scoreList.value= response.body()!!
            }else{
                Log.d("viewmodel","no data")
            }
        }
    }

}