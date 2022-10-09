package com.eugenedevv.openweatherforecast.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.eugenedevv.openweatherforecast.data.remote.dto.Weather

/**
 * Created by EugeneDevv on 09/10/2022.
 */
@Entity
data class CurrentEntity(
    val dt: Int,
    val humidity: Int,
    val pressure: Int,
    val sunrise: Int,
    val sunset: Int,
    val temp: Double,
    val weather: Weather?,
    val windSpeed: Double,
    val timezoneOffSet: Int
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}
