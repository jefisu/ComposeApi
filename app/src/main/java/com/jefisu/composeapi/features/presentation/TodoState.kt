package com.jefisu.composeapi.features.presentation

import com.jefisu.composeapi.features.data.model.Todo

data class TodoState(
    val todos: List<Todo> = emptyList(),
    val isLoading: Boolean = true
)
