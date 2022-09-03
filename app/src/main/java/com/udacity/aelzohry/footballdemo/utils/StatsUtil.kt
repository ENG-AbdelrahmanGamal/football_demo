package com.udacity.aelzohry.footballdemo.utils

import com.udacity.aelzohry.footballdemo.model.Standing
import com.udacity.aelzohry.footballdemo.model.Stat

object StatsUtil {


    fun hightScore(stat:List<Standing>):String{
        var max = 0
        var maxTeam = ""
        stat.forEach {
            it.stats.find {
                it.name == "pointsFor"
            }?.value?.let { goals ->
                if (goals > max) {
                    maxTeam = it.team.name
                    max = goals
                }
            }
        }
        return maxTeam



    }


}