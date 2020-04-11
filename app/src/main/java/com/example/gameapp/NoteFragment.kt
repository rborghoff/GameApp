package com.example.gameapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.note_fragment.*


class NoteFragment : Fragment() {


    private lateinit var viewModel:MainViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.note_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        activity.let {
            viewModel = ViewModelProvider(it!!).get(MainViewModel::class.java)
        }

        super.onViewCreated(view, savedInstanceState)
        cvNotes.layoutManager = LinearLayoutManager(context)
        cvNotes.itemAnimator = DefaultItemAnimator()
        cvNotes.adapter =NoteAdapter(viewModel.quests,R.layout.note_item)
        onClick()
    }

    private fun onClick(){
        fabAddNote.setOnClickListener {
            val action = NoteFragmentDirections.actionNoteFragmentToAddNoteFragment()
            findNavController().navigate(action)
        }
    }
}
