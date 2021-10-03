package com.jefisu.composeapi.features.presentation

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jefisu.composeapi.features.domain.use_case.TodoUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val todoUseCases: TodoUseCases
) : ViewModel() {

    private val _state = mutableStateOf(TodoState())
    val state: State<TodoState> = _state

    init {
        getTodos()
    }

    private fun getTodos() {
        viewModelScope.launch {
            _state.value = state.value.copy(
                todos = todoUseCases.getTodos.invoke(),
                isLoading = false
            )
        }
    }
}