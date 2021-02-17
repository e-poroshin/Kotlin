package com.example.myapplication.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.myapplication.model.Note


@Dao
interface NoteDao {
    @Query("SELECT * FROM Note")
    fun getAll(): List<Note?>?

    @Query("SELECT * FROM Note")
    fun LiveDataGetAll(): LiveData<List<Note?>?>

    @Query("SELECT * FROM Note WHERE uid = :uid")
    fun getById(uid: Long): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(note: Note?)

    @Delete
    fun delete(note: Note?)

    @Update
    fun update(note: Note?)
}