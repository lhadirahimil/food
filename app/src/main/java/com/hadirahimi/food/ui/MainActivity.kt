package com.hadirahimi.food.ui

import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.hadirahimi.food.R
import com.hadirahimi.food.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity()
{
    private lateinit var binding : ActivityMainBinding
    private lateinit var navController : NavController
    override fun onCreate(savedInstanceState : Bundle?)
    {
        super.onCreate(savedInstanceState)
        
        //init view Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        //setup nav controller
        setupNavController()
        navController.addOnDestinationChangedListener { _ , destination , _ ->
            if (destination.id == R.id.fragmentRegister || destination.id == R.id.fragmentVerifyRegister || destination.id == R.id.fragmentLogin)
            {
                orangeStatusBar()
                changeStatusBarContrastStyle(true)
                
            }
            else
            {
                lightStatusBar()
                changeStatusBarContrastStyle(false)
            }
            
            
        }
        
        
    }
    
    private fun setupNavController()
    {
        navController = findNavController(R.id.navHost)
    }
    
    private fun lightStatusBar()
    {
        window.statusBarColor = ContextCompat.getColor(this@MainActivity , R.color.white)
    }
    
    private fun orangeStatusBar()
    {
        window.statusBarColor = ContextCompat.getColor(this@MainActivity , R.color.orange)
    }
    
    override fun onNavigateUp() : Boolean
    {
        return navController.navigateUp() || super.onNavigateUp()
    }
    
    private fun changeStatusBarContrastStyle(lightIcons : Boolean)
    {
        val decorView : View = window.decorView
        if (lightIcons)
        {
            // Draw light icons on a dark background color
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
            {
                decorView.systemUiVisibility =
                    decorView.systemUiVisibility and View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR.inv()
            }
        }
        else
        {
            // Draw dark icons on a light background color
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
            {
                decorView.systemUiVisibility =
                    decorView.systemUiVisibility or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            }
        }
    }
    
    
}