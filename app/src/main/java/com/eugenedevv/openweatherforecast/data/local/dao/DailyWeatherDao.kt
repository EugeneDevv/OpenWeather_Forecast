package com.eugenedevv.openweatherforecast.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.eugenedevv.openweatherforecast.data.local.entities.DailyEntity
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Observable

/**
 * Created by EugeneDevv on 09/10/2022.
 */
@Dao
interface DailyWeatherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addAllDailyEntity(dailyEntity: List<DailyEntity>): Completable

    @Query("SELECT * FROM DailyEntity ORDER BY id ASC LIMIT 5 ")
    fun getFirstFiveDailyEntity(): Observable<List<DailyEntity>>

    @Query("DELETE FROM DailyEntity")
    fun deleteAll(): Completable
}