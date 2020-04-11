package com.example.gameapp.data

import android.app.Application
import android.content.Context
import android.os.AsyncTask
import androidx.lifecycle.LiveData
import com.example.gameapp.model.Notes

class NotesRepository { fun getHvaQuest(): List<Notes> {
    return arrayListOf(
        Notes(
            "Who is the co-founder of Android?"
        ),
        Notes(
            "In which language is Android written?"
        ),
        Notes(
            "Which method gets called after onCreate in the Activity-lifecycle?"
        ),
        Notes(
            "In what year did google announce Material Design?"

        ),
        Notes(
            "What is the code name of version 1.6?"

        ),
        Notes(
            "Which version of Android did not run on phones?"

        ),
        Notes(
            "When did Google announced Android Wear?"

        ),
        Notes(
            "Who built the first smartwatch?"

        ),
        Notes(
            "For what for OS was Android originally created?"

        ),
        Notes(
            "Who is the CEO of Google?"

        )
    )
}
    fun getQuestion(index: Int) : Notes {
        return getHvaQuest()[index]
    }
}