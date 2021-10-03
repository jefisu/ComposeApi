package com.jefisu.composeapi.features.domain.repository

import com.jefisu.composeapi.features.data.model.Todo

interface TodoRepository {

    suspend fun getTodos() : ArrayList<Todo>
}