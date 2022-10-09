package com.eugenedevv.openweatherforecast.domain.repository

import com.eugenedevv.openweatherforecast.data.local.entities.CurrentEntity
import com.eugenedevv.openweatherforecast.data.local.entities.DailyEntity
import com.eugenedevv.openweatherforecast.data.local.entities.HourlyEntity
import com.eugenedevv.openweatherforecast.data.local.entities.LocationEntity
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Observable

/**
 * Created by EugeneDevv on 09/10/2022.
 */
interface WeatherForecastRepository {

    fun searchByCityName(cityName: String): Completable

    fun getCurrentForecast(): Observable<CurrentEntity>

    fun getCurrentLocation(): Observable<LocationEntity>

    fun getTodaysForecast(): Observable<List<HourlyEntity>>

    fun getTomorrowsForecast(): Observable<List<HourlyEntity>>

    fun getFiveDaysForecast(): Observable<List<DailyEntity>>

}