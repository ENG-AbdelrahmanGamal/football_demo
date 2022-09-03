package com.udacity.aelzohry.footballdemo.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.udacity.aelzohry.footballdemo.model.League
import com.udacity.aelzohry.footballdemo.model.TeamLeaguesResponse
import com.udacity.aelzohry.footballdemo.networking.Service
import kotlinx.coroutines.launch
import java.lang.Exception

// TODO: add repository
class HomeViewModel : ViewModel() {

    private val _leagues = MutableLiveData<Array<League>>()
    val leagues: LiveData<Array<League>>
        get() = _leagues

    private val _teamLeagues = MutableLiveData<TeamLeaguesResponse>()
    val teamLeagues: LiveData<TeamLeaguesResponse>
        get() = _teamLeagues


    fun fetchLeagues() {
        viewModelScope.launch {
            try {
                val response = Service.leaguesService.getLeagues()
                Log.i("HomeViewModel", "size: ${response.data.size}")
                _leagues.value = response.data
            } catch (er: Exception) {
                // TODO: Handle exception
            }
        }
    }

    fun getTeamLeagues(league:String,season:String){

        viewModelScope.launch {
            try {
                val response = Service.leaguesService.getTeams(league,season)
               Log.i("HomeViewModel", "size: ${response.data.standings.size}")
                _teamLeagues.value = response
            } catch (er: Exception) {
                // TODO: Handle exception
            }
        }


    }

}