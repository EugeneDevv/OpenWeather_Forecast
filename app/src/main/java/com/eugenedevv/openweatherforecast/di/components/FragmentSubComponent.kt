package com.eugenedevv.openweatherforecast.di.components

import com.eugenedevv.openweatherforecast.di.FragmentScope
import com.eugenedevv.openweatherforecast.di.modules.ViewModelModule
import com.eugenedevv.openweatherforecast.presentation.forecast.CurrentWeatherForecastFragment
import com.eugenedevv.openweatherforecast.presentation.weatherDetailsTabDay.DayWeatherDetailsFragment
import dagger.Subcomponent

/**
 * Created by EugeneDevv on 09/10/2022.
 */
@FragmentScope
@Subcomponent(modules = [ViewModelModule::class])
interface FragmentSubComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): FragmentSubComponent
    }

    fun inject(currentWeatherForecastFragment: CurrentWeatherForecastFragment)
    fun inject(dayWeatherDetailsFragment: DayWeatherDetailsFragment)
}