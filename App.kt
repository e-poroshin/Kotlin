package com.example.myapplication

import android.app.Application
import androidx.room.Room
import com.example.myapplication.data.DBNote
import com.example.myapplication.data.NoteDao

class App: Application() {

    private lateinit var dbNote:DBNote
    private lateinit var noteDao:NoteDao

    private lateinit var instance:App

    fun getInstance():App{
        return instance
    }

    override fun onCreate(){
        super.onCreate()

        instance = this

        dbNote = Room.databaseBuilder(applicationContext,DBNote::class.java, "app-db-name")
                .allowMainThreadQueries().build()

        noteDao = dbNote.noteDao()
    }

    fun getDatabase(): DBNote {
        return dbNote
    }

    fun setDatabase(dbNote: DBNote){
        this.dbNote = dbNote
    }

    fun getNoteDao(): NoteDao {
        return noteDao
    }

    fun setNoteDao(noteDao: NoteDao){
        this.noteDao = noteDao
    }
}