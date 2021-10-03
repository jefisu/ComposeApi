package com.jefisu.composeapi.features.data

import com.jefisu.composeapi.features.data.model.Todo
import com.jefisu.composeapi.features.data.remote.TodoApi
import com.jefisu.composeapi.features.domain.repository.TodoRepository

class TodoRepositoryImp(
    private val todoApi: TodoApi
) : TodoRepository {

    override suspend fun getTodos(): ArrayList<Todo> {
       return todoApi.getPosts()
    }
}
