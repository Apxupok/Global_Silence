package com.example.globalsilence.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Part::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun partDao(): PartDao


/*

    companion object {
        private const val DATABASE_NAME = "mydatabase.db"
        private var instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    DATABASE_NAME
                ).build()
            }
            return instance!!
        }


    }

 */

}