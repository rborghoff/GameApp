package com.example.gameapp

import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gameapp.model.Notes

class NoteAdapter(val quests: List<Notes>, val itemlayout: Int): RecyclerView.Adapter<NoteViewModel>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewModel {
        val view = LayoutInflater.from(parent.context).inflate(itemlayout,parent,false)
        return  NoteViewModel(view)
    }

    override fun getItemCount(): Int {
        return quests.size   }

    override fun onBindViewHolder(holder: NoteViewModel, position: Int) {
        val quest = quests.get(position)
        holder.updateQuest(quest)
    }
}