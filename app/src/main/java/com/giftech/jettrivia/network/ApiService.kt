package com.giftech.jettrivia.network

import com.giftech.jettrivia.model.Question
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface ApiService {
    @GET("world.json")
    suspend fun getAllQuestions(): Question
}