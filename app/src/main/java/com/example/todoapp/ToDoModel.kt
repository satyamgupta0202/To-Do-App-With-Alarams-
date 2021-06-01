package com.example.todoapp

import androidx.room.Entity
import androidx.room.PrimaryKey
import org.intellij.lang.annotations.PrintFormat

@Entity
data class ToDoModel(
    var title:String,
    var description:String,
    var category:String,
    var date:Long,
    var time:Long,
    var isFinished:Int = -1,
    @PrimaryKey(autoGenerate = true)
    var id:Long=0
)