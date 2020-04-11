package com.example.gameapp

import android.content.Context
import androidx.lifecycle.ViewModel
import com.example.gameapp.data.NotesRepository
import com.example.gameapp.model.Notes

class MainViewModel: ViewModel() {
    private val notesRepository =NotesRepository()
    val quests: List<Notes> = notesRepository.getHvaQuest()

}