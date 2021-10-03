package com.jefisu.composeapi.features.data.model

data class Todo(
    val body: String,
    val id: Int,
    val title: String,
    val userId: Int
)