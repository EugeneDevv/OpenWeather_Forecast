package com.eugenedevv.openweatherforecast.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by EugeneDevv on 09/10/2022.
 */
@Entity
data class LocationEntity(
    val country: String,
    val lat: Double,
    val lon: Double,
    val name: String,
    val state: String?
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}
