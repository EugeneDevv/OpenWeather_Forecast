package com.eugenedevv.openweatherforecast

import android.app.Application
import com.eugenedevv.openweatherforecast.common.TimberLoggingTree
import com.eugenedevv.openweatherforecast.di.components.AppComponent
import com.eugenedevv.openweatherforecast.di.components.DaggerAppComponent
import timber.log.Timber

/**
 * Created by EugeneDevv on 09/10/2022.
 */
class App : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        Timber.plant(TimberLoggingTree())
        appComponent = DaggerAppComponent.builder()
            .application(this).build()
        appComponent.inject(this)
    }
}