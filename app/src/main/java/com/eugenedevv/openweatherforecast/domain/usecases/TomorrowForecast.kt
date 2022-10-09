package com.eugenedevv.openweatherforecast.domain.usecases

import com.eugenedevv.openweatherforecast.data.local.entities.HourlyEntity
import com.eugenedevv.openweatherforecast.domain.repository.WeatherForecastRepository
import io.reactivex.rxjava3.core.Observable
import javax.inject.Inject

/**
 * Created by EugeneDevv on 09/10/2022.
 */
class TomorrowForecast @Inject constructor(
    private val weatherForecastRepository: WeatherForecastRepository
) {

    fun getForecast(): Observable<List<HourlyEntity>> {
        return weatherForecastRepository.getTomorrowsForecast()
    }
}