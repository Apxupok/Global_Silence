package com.example.globalsilence.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface PartDao {
    @Query("SELECT* FROM Parts")
    fun getAllParts(): List<Part>

    @Insert
    fun insertPart(part: Part)

    @Update
    fun updatePart(part: Part)

    @Delete
    fun deletePart(part: Part)
}