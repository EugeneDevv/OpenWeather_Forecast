package com.eugenedevv.openweatherforecast.data.remote.api

import com.eugenedevv.openweatherforecast.data.remote.dto.GeocodingDtoItem
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by EugeneDevv on 09/10/2022.
 */
interface GeocodingApi {

    @GET("direct")
    fun getGeocoding(
        @Query("q") cityName: String,
        @Query("appid") apiKey: String,
        @Query("limit") limit: Int = 1
    ): Observable<List<GeocodingDtoItem>>

}