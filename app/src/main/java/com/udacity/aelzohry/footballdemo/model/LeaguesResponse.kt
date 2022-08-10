package com.udacity.aelzohry.footballdemo.model

data class LeaguesResponse(
    val status: Boolean,
    val data: Array<League>,
)
