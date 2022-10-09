package com.eugenedevv.openweatherforecast.data.remote.api

import com.eugenedevv.openweatherforecast.data.remote.dto.OneCallWeatherForecast
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by EugeneDevv on 09/10/2022.
 */
interface WeatherForecastApi {


    @GET("onecall")
    fun getWeatherForecastByLatitudeLongitude(
        @Query("lat") latitude: String,
        @Query("lon") longitude: String,
        @Query("exclude") exclude: String,
        @Query("appid") apiKey: String,
        @Query("units") unit: String = "metric",
    ): Observable<OneCallWeatherForecast>

    @GET("weather")
    fun getCurrentWeather(
        @Query("q") cityName: String,
        @Query("appid") apiKey: String
    )


}