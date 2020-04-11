package com.example.gameapp

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.gameapp.model.Notes
import kotlinx.android.synthetic.main.fragment_add_note.*
import kotlinx.android.synthetic.main.note_item.*


class AddNoteFragment : Fragment() {

private lateinit var viewModel: MainViewModel
    var note = arrayListOf<Notes>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(activity as AppCompatActivity).get(MainViewModel::class.java)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_note, container, false)

    }


}
