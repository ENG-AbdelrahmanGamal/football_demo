package com.udacity.aelzohry.footballdemo.utils

import android.util.Log
import com.udacity.aelzohry.footballdemo.model.*
import org.junit.Assert.*

import org.junit.Test

class StatsUtilTest {

    @Test
    fun hightScore_givenOnePestTeam_ReturnOnTeam() {
        //given

        val stat:Stat=Stat("","","",
            "","","pointsFor","","","",1)
        val team=Team("","","",true,
            "", listOf<Logo>(),"Liverpool","","")
        val standing:Standing= Standing(note=null, listOf(stat), team = team)


        val stat2:Stat=Stat("","","",
            "","","pointsFor","","","",7)
        val team2=Team("","","",true,
            "", listOf<Logo>(),"Everton","","")
        val standing2:Standing= Standing(note=null, listOf(stat2), team = team2)


        val stat3:Stat=Stat("","","",
            "","","pointsFor","","","",4)
        val team3=Team("","","",true,
            "", listOf<Logo>(),"Arsenal","","")
        val standing3:Standing= Standing(note=null, listOf(stat3), team = team3)
        //when


   val result=StatsUtil.hightScore(listOf(standing,standing2,standing3))


        //then
        assert(result=="Everton")
//        Log.d("test", "hightScore_givenOnePestTeam_ReturnOnTeam:$result ")
    }
}