package com.example.myapplication.screens.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.App
import com.example.myapplication.model.Note

class MainViewModel(private var allId:App): ViewModel() {
    private var noteLiveData: LiveData<List<Note?>?> =allId.getInstance().getNoteDao().LiveDataGetAll()

    fun getNoteLiveData(): LiveData<List<Note?>?> {
        return noteLiveData
    }


}