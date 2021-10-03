package com.jefisu.composeapi.di

import com.jefisu.composeapi.features.data.TodoRepositoryImp
import com.jefisu.composeapi.features.data.remote.TodoApi
import com.jefisu.composeapi.features.domain.use_case.GetTodos
import com.jefisu.composeapi.features.domain.use_case.TodoUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideTodoApi() : TodoApi {
        return Retrofit.Builder()
            .baseUrl(TodoApi.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(TodoApi::class.java)
    }

    @Provides
    @Singleton
    fun provideTodoRepository(api: TodoApi) : TodoRepositoryImp {
        return TodoRepositoryImp(api)
    }

    @Provides
    @Singleton
    fun provideTodoUseCases(repository: TodoRepositoryImp) : TodoUseCases {
        return TodoUseCases(
            getTodos = GetTodos(repository)
        )
    }
}