package com.udacity.aelzohry.footballdemo.networking

import com.udacity.aelzohry.footballdemo.model.League
import com.udacity.aelzohry.footballdemo.model.LeaguesResponse
import com.udacity.aelzohry.footballdemo.model.TeamLeaguesResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface LeaguesService {
    @GET("leagues")
    suspend fun getLeagues(): LeaguesResponse

    @GET("leagues/{league}/standings")
    suspend fun getTeams(
        @Path("league") league: String,
        @Query("season") season: String,
        @Query("sort") sort: String="asc"
    ): TeamLeaguesResponse
}
//https://api-football-standings.azharimm.site/leagues/eng.1/standings?season=2022&sort=asc
