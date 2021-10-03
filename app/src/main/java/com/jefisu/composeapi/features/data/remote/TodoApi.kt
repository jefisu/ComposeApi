package com.jefisu.composeapi.features.data.remote

import com.jefisu.composeapi.features.data.model.Todo
import retrofit2.http.GET

interface TodoApi {

    @GET("/posts")
    suspend fun getPosts() : ArrayList<Todo>

    companion object {
        const val BASE_URL = "https://jsonplaceholder.typicode.com"
    }
}