package com.udacity.aelzohry.footballdemo.networking

import com.udacity.aelzohry.footballdemo.model.LeaguesResponse
import retrofit2.http.GET

interface LeaguesService {
    @GET("leagues")
    suspend fun getLeagues(): LeaguesResponse
}