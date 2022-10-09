package com.eugenedevv.openweatherforecast.presentation

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.eugenedevv.openweatherforecast.App
import com.eugenedevv.openweatherforecast.R
import com.eugenedevv.openweatherforecast.databinding.ActivityMainBinding
import com.eugenedevv.openweatherforecast.di.components.ActivitySubComponent

class MainActivity : AppCompatActivity() {

    lateinit var activitySubComponent: ActivitySubComponent

    private lateinit var navController: NavController
    lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        activitySubComponent =
            (application as App).appComponent.getActivityComponentFactory().create()
        activitySubComponent.inject(this)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment

        navController = navHostFragment.navController

        setSupportActionBar(binding.toolbar)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        binding.toolbar
            .setupWithNavController(navController, appBarConfiguration)

    }


    fun setToolBarTitle(title: String) {
        binding.toolbar.title = title
        binding.toolbar.setTitleTextColor(Color.WHITE)
    }
}