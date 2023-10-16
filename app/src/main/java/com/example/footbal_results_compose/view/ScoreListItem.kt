package com.example.footbal_results_compose.view

import android.widget.TextView
import androidx.compose.foundation.lazy.LazyColumn

import com.example.footbal_results_compose.data.model.Result
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ScoreList(scoreList:List<Result>) {
    
    
    LazyColumn{
        items(scoreList){
            ResultListItem(result = it)
        }
    }
}

@Composable
fun ResultListItem(result: Result) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color.White)
    ) {
        val teamNameModifier = Modifier
            .weight(1f)
            .padding(8.dp)

        // Home and Away team names
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = result.home,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                modifier = teamNameModifier
            )

            Text(
                text = result.away,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                modifier = teamNameModifier
            )
        }

        // Match date
        Text(
            text = result.date,
            fontSize = 14.sp,
            modifier = teamNameModifier
        )

        // Match score
        Text(
            text = result.skor,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = teamNameModifier
        )
    }
}