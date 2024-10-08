package com.example.androidbooklist.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Library::class], version = 2, exportSchema = false)
abstract class LibraryDatabase : RoomDatabase(){
    abstract fun libraryDao(): LibraryDao
}