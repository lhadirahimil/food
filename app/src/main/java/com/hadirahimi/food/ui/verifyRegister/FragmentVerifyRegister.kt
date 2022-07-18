package com.hadirahimi.food.ui.verifyRegister

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.hadirahimi.food.databinding.FragmentVerifyRegisterBinding
import com.hadirahimi.food.ui.register.FragmentRegisterDirections

class FragmentVerifyRegister : Fragment()
{
    private lateinit var binding : FragmentVerifyRegisterBinding
    override fun onCreateView(
        inflater : LayoutInflater , container : ViewGroup? , savedInstanceState : Bundle?
    ) : View
    {
        // Inflate the layout for this fragment
        binding = FragmentVerifyRegisterBinding.inflate(layoutInflater)
        return binding.root
    }
    
    override fun onViewCreated(view : View , savedInstanceState : Bundle?)
    {
        super.onViewCreated(view , savedInstanceState)
        
        binding.apply {
            
            // go back image view click listener
            ivBack.setOnClickListener {
                // go back
                findNavController().navigateUp()
            }
            
        }
    }
    
    
}