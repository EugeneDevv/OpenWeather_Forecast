package com.eugenedevv.openweatherforecast.di.modules

import androidx.lifecycle.ViewModel
import com.eugenedevv.openweatherforecast.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * Created by EugeneDevv on 09/10/2022.
 */
@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(CurrentWeatherForecastViewModel::class)
    abstract fun bindCurrentWeatherViewModel(currentWeatherFactory: CurrentWeatherForecastViewModel.Factory): AssistedSavedStateViewModelFactory<out ViewModel>

    @Binds
    @IntoMap
    @ViewModelKey(DayWeatherDetailsViewModel::class)
    abstract fun bindDayWeatherDetailViewModel(dayWeatherDetailsViewModel: DayWeatherDetailsViewModel): ViewModel

}