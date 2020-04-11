package com.example.gameapp

import android.app.Application
import android.content.Context
import android.view.View
import android.widget.TextView
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.gameapp.data.NotesRepository
import com.example.gameapp.model.Notes

class NoteViewModel (itemView: View): RecyclerView.ViewHolder(itemView) {
    private var label: TextView = itemView.findViewById(R.id.tvNote)

    fun updateQuest(quest: Notes) {
        label.text = quest.title
    }
}