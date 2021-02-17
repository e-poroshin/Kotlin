package com.example.myapplication.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapplication.model.Note
import com.example.myapplication.data.NoteDao

@Database(entities = [Note::class], version = 1)
abstract class DBNote: RoomDatabase() {
    abstract fun noteDao(): NoteDao


}