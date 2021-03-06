package com.example.todoapp

import androidx.room.Database
import androidx.room.Entity
import androidx.room.RoomDatabase

@Database(entities = [ToDoModel::class],version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun todoDao():ToDoDao
}