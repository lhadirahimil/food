package com.hadirahimi.food.ui.onBoarding

import android.os.Bundle
import android.text.Spannable
import android.text.style.ForegroundColorSpan
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.text.toSpannable
import androidx.navigation.fragment.findNavController
import com.hadirahimi.food.R
import com.hadirahimi.food.databinding.FragmentOnBoardingBinding


class FragmentOnBording : Fragment()
{
    
    private lateinit var binding : FragmentOnBoardingBinding
    
    override fun onCreateView(
        inflater : LayoutInflater , container : ViewGroup? , savedInstanceState : Bundle?
    ) : View
    {
        binding = FragmentOnBoardingBinding.inflate(layoutInflater)
        return binding.root
    }
    
    override fun onViewCreated(view : View , savedInstanceState : Bundle?)
    {
        super.onViewCreated(view , savedInstanceState)
        // change some part of text colors to orange
        setupTitleColor()
        //click listener events
        binding.apply {
            btnLetsGoLayout.setOnClickListener {
                // go to register fragment
                val direction = FragmentOnBordingDirections.actionFragmentOnBoardingToFragmentRegister()
                findNavController().navigate(direction)
            }
        }
    }
    
    private fun setupTitleColor()
    {
        binding.apply {
            val title : Spannable = tvTitle.text.toSpannable()
            if (tvTitle.text.isNotEmpty()){
                title.setSpan (ForegroundColorSpan(ContextCompat.getColor(requireContext(),R.color.orange)), 18, 24, 34);
            }
            binding.tvTitle.text = title
        }
    }
    
   
    
}