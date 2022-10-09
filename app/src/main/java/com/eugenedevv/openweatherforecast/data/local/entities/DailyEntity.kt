package com.eugenedevv.openweatherforecast.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.eugenedevv.openweatherforecast.data.remote.dto.Weather

/**
 * Created by EugeneDevv on 09/10/2022.
 */
@Entity
data class DailyEntity(
    val dt: Int,
    val pressure: Int,
    val humidity: Int,
    val temp: Double,
    val weather: Weather?,
    val windSpeed: Double,
    val timezoneOffSet: Int
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}
