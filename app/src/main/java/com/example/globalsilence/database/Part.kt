package com.example.globalsilence.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Parts")
data class Part(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "first_name") val firstName: String?,
    @ColumnInfo(name = "last_name") val lastName: String?

    /*
    val length: Int,
    val height: Int,
    val width: Int,
    val name: String,
    val deep:Int

     */
)
