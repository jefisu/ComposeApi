package com.jefisu.composeapi.features.domain.use_case

import com.jefisu.composeapi.features.data.model.Todo
import com.jefisu.composeapi.features.domain.repository.TodoRepository

class GetTodos(
    private val repository: TodoRepository
) {

    suspend operator fun invoke(): ArrayList<Todo> {
        return repository.getTodos()
    }
}