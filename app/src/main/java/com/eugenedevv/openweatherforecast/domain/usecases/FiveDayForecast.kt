package com.eugenedevv.openweatherforecast.domain.usecases

import com.eugenedevv.openweatherforecast.data.local.entities.DailyEntity
import com.eugenedevv.openweatherforecast.domain.repository.WeatherForecastRepository
import io.reactivex.rxjava3.core.Observable
import javax.inject.Inject

/**
 * Created by EugeneDevv on 09/10/2022.
 */
class FiveDayForecast @Inject constructor(
    private val weatherForecastRepository: WeatherForecastRepository
) {

    fun getForecast(): Observable<List<DailyEntity>> {
        return weatherForecastRepository.getFiveDaysForecast()
    }
}