package com.example.myapplication.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(@PrimaryKey(autoGenerate = true) @ColumnInfo(name = "uid") var uid:Int,
                @ColumnInfo(name = "text") var text:String,
                @ColumnInfo(name = "timeCreate") var timeCreate:Int,
                @ColumnInfo(name = "done") var done:Boolean) {

}