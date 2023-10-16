package com.example.footbal_results_compose.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.LocalDensity

import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.footbal_results_compose.R
import kotlin.math.roundToInt

@Composable
fun DetailScreen(navController: NavController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White), // Background color
        contentAlignment = Alignment.Center
    ) {
        // ImageView in the center
        Image(
            painter = painterResource(id = R.drawable.gs),
            contentDescription = null, // Set a description for accessibility
            contentScale = ContentScale.Fit, // You can change this based on your needs
            modifier = Modifier
                .size(200.dp) // Adjust the size of the image
        )
    }

}