package com.udacity.aelzohry.footballdemo.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.udacity.aelzohry.footballdemo.model.League
import com.udacity.aelzohry.footballdemo.ui.home.HomeAdapter

@BindingAdapter("leaguesList")
fun RecyclerView.setLeagues(list: Array<League>?) {
    list?.let {
        val adapter = adapter as HomeAdapter
        adapter.list = it
    }
}

@BindingAdapter("imageUrl")
fun ImageView.setImageUrl(imageUrl: String) {
    // TODO: handle errors & add placeholder
    Glide.with(context)
        .load(imageUrl)
        .into(this)
}