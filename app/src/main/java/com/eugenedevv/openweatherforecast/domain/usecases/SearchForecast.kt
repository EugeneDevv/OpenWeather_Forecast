package com.eugenedevv.openweatherforecast.domain.usecases

import com.eugenedevv.openweatherforecast.domain.repository.WeatherForecastRepository
import io.reactivex.rxjava3.core.Completable
import javax.inject.Inject

/**
 * Created by EugeneDevv on 09/10/2022.
 */
class SearchForecast @Inject constructor(
    private val weatherForecastRepository: WeatherForecastRepository
) {

    fun byCityNameForecast(cityName: String): Completable {
        return weatherForecastRepository.searchByCityName(cityName)
    }

}