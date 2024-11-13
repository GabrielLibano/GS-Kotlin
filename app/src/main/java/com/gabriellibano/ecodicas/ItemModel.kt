package com.gabriellibano.ecodicas
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ItemModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val titulo: String,
    val desc: String
)