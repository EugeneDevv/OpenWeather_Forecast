package com.eugenedevv.openweatherforecast.di.modules

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by EugeneDevv on 09/10/2022.
 */
@Module
class WeatherDatabaseModule {

    @Provides
    @Singleton
    fun provideWeatherDatabase(application: Application): WeatherDatabase {
        return Room.databaseBuilder(
            application,
            WeatherDatabase::class.java,
            Constants.WEATHER_DATABASE_NAME
        )
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun provideCurrentWeatherDao(weatherDatabase: WeatherDatabase) =
        weatherDatabase.getCurrentWeatherDao()

    @Provides
    @Singleton
    fun provideDailyWeatherDao(weatherDatabase: WeatherDatabase) =
        weatherDatabase.getDailyWeatherDao()

    @Provides
    @Singleton
    fun provideHourlyWeatherDao(weatherDatabase: WeatherDatabase) =
        weatherDatabase.getHourlyWeatherDao()

    @Provides
    @Singleton
    fun provideLocationDao(weatherDatabase: WeatherDatabase) = weatherDatabase.getLocationDao()
}