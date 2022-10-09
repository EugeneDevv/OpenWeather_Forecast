package com.eugenedevv.openweatherforecast.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.eugenedevv.openweatherforecast.data.local.entities.HourlyEntity
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Observable

/**
 * Created by EugeneDevv on 09/10/2022.
 */
@Dao
interface HourlyWeatherDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addAllHourlyEntity(hourlyEntity: List<HourlyEntity>): Completable

    @Query("SELECT * FROM HourlyEntity LIMIT 24")
    fun getTodayHourlyWeather(): Observable<List<HourlyEntity>>

    @Query("SELECT * FROM HourlyEntity ORDER BY id DESC LIMIT 24")
    fun getTomorrowHourlyWeather(): Observable<List<HourlyEntity>>

    @Query("DELETE FROM HourlyEntity")
    fun deleteAll(): Completable
}