package com.udacity.aelzohry.footballdemo.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.udacity.aelzohry.footballdemo.R
import com.udacity.aelzohry.footballdemo.databinding.ItemLeagueBinding
import com.udacity.aelzohry.footballdemo.model.League

// TODO: implement ListAdapter instead
class HomeAdapter : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {
    var list = arrayOf<League>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val binding: ItemLeagueBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_league,
            parent,
            false
        )
        return HomeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val league = list[position]
        holder.bind(league)
    }

    override fun getItemCount(): Int = list.size

    class HomeViewHolder(private val binding: ItemLeagueBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(league: League) {
            binding.league = league
            binding.executePendingBindings()
        }

    }

}