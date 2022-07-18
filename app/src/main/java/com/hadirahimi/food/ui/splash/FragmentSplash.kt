package com.hadirahimi.food.ui.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.hadirahimi.food.R
import com.hadirahimi.food.databinding.FragmentSplashBinding
import kotlinx.coroutines.delay

class FragmentSplash : Fragment()
{
    private lateinit var binding : FragmentSplashBinding
    override fun onCreateView(
        inflater : LayoutInflater , container : ViewGroup? , savedInstanceState : Bundle?
    ) : View
    {
        binding = FragmentSplashBinding.inflate(layoutInflater)
        return binding.root
    }
    
    override fun onViewCreated(view : View , savedInstanceState : Bundle?)
    {
        super.onViewCreated(view , savedInstanceState)
        lifecycleScope.launchWhenCreated {
            delay(2000)
            //check if user in logged in account so go to home fragment else go to boarding fragment
            val directions = FragmentSplashDirections.actionToFragmentOnBoarding()
            findNavController().navigate(directions)
        }
    }
}