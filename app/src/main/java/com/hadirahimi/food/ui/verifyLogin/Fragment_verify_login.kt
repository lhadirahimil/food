package com.hadirahimi.food.ui.verifyLogin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.hadirahimi.food.databinding.FragmentVerifyLoginBinding


class Fragment_verify_login : Fragment()
{
    
    private lateinit var binding : FragmentVerifyLoginBinding
    override fun onCreateView(
        inflater : LayoutInflater , container : ViewGroup? , savedInstanceState : Bundle?
    ) : View
    {
        // Inflate the layout for this fragment
        binding = FragmentVerifyLoginBinding.inflate(layoutInflater , container , false)
        return binding.root
    }
    
    override fun onViewCreated(view : View , savedInstanceState : Bundle?)
    {
        super.onViewCreated(view , savedInstanceState)
        
        //init views
        binding.apply {
            // go back image view click listener
            ivBack.setOnClickListener {
                // go back
                findNavController().navigateUp()
            }
        }
    }
}