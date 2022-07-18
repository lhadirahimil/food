package com.hadirahimi.food.ui.register

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.hadirahimi.food.databinding.FragmentRegisterBinding


class FragmentRegister : Fragment()
{
    private lateinit var binding : FragmentRegisterBinding
    override fun onCreateView(
        inflater : LayoutInflater , container : ViewGroup? , savedInstanceState : Bundle?
    ) : View
    {
//        //change status bar colors to orange
//        setupStatusColor()
        // Inflate the layout for this fragment
        binding = FragmentRegisterBinding.inflate(layoutInflater)
        return binding.root
    }
    
    override fun onViewCreated(view : View , savedInstanceState : Bundle?)
    {
        super.onViewCreated(view , savedInstanceState)
        
        //click listener
        clickListener()
        
        
    }
    
    private fun clickListener()
    {
        binding.apply {
            
            // submit register click listener
            btnRegister.setOnClickListener {
                //check input
                findNavController().navigate(FragmentRegisterDirections.actionFragmentRegisterToFragmentVerifyRegister())
            }
            
            // login text view click listener
            tvLogin.setOnClickListener {
                // go to login fragment
                findNavController().navigate(FragmentRegisterDirections.actionToFragmentLogin())
            }
            
        }
    }
    
    private fun checkInput()
    {
        binding.apply {
            if (etUserName.text.toString().isEmpty())
            {
            
            }
        }
    }
    
    
}