package com.udacity.aelzohry.footballdemo.model

/*
{
    id: "arg.1",
    name: "Argentine Liga Profesional de Fútbol",
    slug: "argentine-liga-profesional-de-futbol",
    abbr: "Prim A",
    logos: {
        light: "https://a.espncdn.com/i/leaguelogos/soccer/500/1.png",
        dark: "https://a.espncdn.com/i/leaguelogos/soccer/500-dark/1.png"
    }
}
 */
data class League(
    val id: String,
    val name: String,
    val abbr: String,
    val logos: Logo,
)

data class Logo(
    val light: String,
    val dark: String,
)