package com.eugenedevv.openweatherforecast.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.eugenedevv.openweatherforecast.data.local.dao.CurrentWeatherDao
import com.eugenedevv.openweatherforecast.data.local.dao.DailyWeatherDao
import com.eugenedevv.openweatherforecast.data.local.dao.HourlyWeatherDao
import com.eugenedevv.openweatherforecast.data.local.dao.LocationDao
import com.eugenedevv.openweatherforecast.data.local.entities.CurrentEntity
import com.eugenedevv.openweatherforecast.data.local.entities.DailyEntity
import com.eugenedevv.openweatherforecast.data.local.entities.HourlyEntity
import com.eugenedevv.openweatherforecast.data.local.entities.LocationEntity

/**
 * Created by EugeneDevv on 09/10/2022.
 */
@Database(
    entities = [CurrentEntity::class, DailyEntity::class, HourlyEntity::class, LocationEntity::class],
    version = 1
)
@TypeConverters(WeatherConverter::class)
abstract class WeatherDatabase : RoomDatabase() {
    abstract fun getCurrentWeatherDao(): CurrentWeatherDao
    abstract fun getDailyWeatherDao(): DailyWeatherDao
    abstract fun getHourlyWeatherDao(): HourlyWeatherDao
    abstract fun getLocationDao(): LocationDao
}