package com.hadirahimi.food.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.hadirahimi.food.databinding.FragmentLoginBinding

class FragmentLogin : Fragment()
{
    
    private lateinit var binding : FragmentLoginBinding
    
    override fun onCreateView(
        inflater : LayoutInflater , container : ViewGroup? , savedInstanceState : Bundle?
    ) : View
    {
        binding = FragmentLoginBinding.inflate(layoutInflater)
        return binding.root
    }
    
    override fun onViewCreated(view : View , savedInstanceState : Bundle?)
    {
        super.onViewCreated(view , savedInstanceState)
        //init view
        binding.apply {
            // tv register click listener
            tvRegister.setOnClickListener {
                //go to register fragment
                findNavController().navigate(FragmentLoginDirections.actionToFragmentRegister())
            }
            
            // go back image view click listener
            ivBack.setOnClickListener {
                // go back
                findNavController().navigateUp()
            }
    
            // submit login click listener
            btnLogin.setOnClickListener {
                findNavController().navigate(FragmentLoginDirections.actionFragmentLoginToFragmentVerifyLogin())
            }
        }
    }
    
}