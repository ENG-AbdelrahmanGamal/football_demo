package com.udacity.aelzohry.footballdemo.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.udacity.aelzohry.footballdemo.R
import com.udacity.aelzohry.footballdemo.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private val viewModel: HomeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // set recyclerView adapter
        binding.recyclerView.adapter = HomeAdapter()

        // set binding viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = viewModel

        // fetch leagues list
        viewModel.fetchLeagues()
    }

}