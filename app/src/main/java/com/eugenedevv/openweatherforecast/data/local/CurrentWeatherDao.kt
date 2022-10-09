package com.eugenedevv.openweatherforecast.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.eugenedevv.openweatherforecast.data.local.entities.CurrentEntity
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Observable

/**
 * Created by EugeneDevv on 09/10/2022.
 */
@Dao
interface CurrentWeatherDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addCurrent(currentEntity: CurrentEntity): Completable

    @Query("SELECT * FROM CurrentEntity LIMIT 1")
    fun getCurrent(): Observable<CurrentEntity>

    @Query("DELETE FROM CurrentEntity")
    fun deleteAll(): Completable
}