package com.jefisu.composeapi.features.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.jefisu.composeapi.features.presentation.components.CardItem

@Composable
fun MainScreen(
    viewModel: MainViewModel = hiltViewModel()
) {
    val response = viewModel.state.value

    Scaffold(modifier = Modifier.fillMaxSize()) {
        LazyColumn {
            items(response.todos) {
                CardItem(todo = it)
            }
        }
        if (response.isLoading) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator()
            }
        }
    }
}