package com.eugenedevv.openweatherforecast.data.remote.dto

import com.eugenedevv.openweatherforecast.data.local.entities.LocationEntity

data class GeocodingDtoItem(
    val country: String,
    val lat: Double,
    val lon: Double,
    val name: String,
    val state: String?
) {

    fun mapToLocationEntity(): LocationEntity {
        return LocationEntity(country, lat, lon, name, state)
    }
}