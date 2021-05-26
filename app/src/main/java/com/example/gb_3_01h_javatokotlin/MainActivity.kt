package com.example.gb_3_01h_javatokotlin

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val note = Note("Первая", "Текст первой заметки")

        val mainButton: Button = findViewById(R.id.main_button)
        mainButton.setOnClickListener { mainButtonClick(note) }

        val notesList = MockNotesRepository.getNotesList();

        println()

        for (note in notesList) {
            println(note.body)
        }

        println("--- until ---")

        for (i in 0 until notesList.size) {
            println(notesList[i])
        }

        println("--- step ---")

        for(i in 12 downTo 1 step 3) {
            println(i)
        }

    }

    private fun mainButtonClick(note: Note) {
        val mainTitle: TextView = findViewById(R.id.main_title)
        val mainBody: TextView = findViewById(R.id.main_body)

        mainTitle.setText(note.title)
        mainBody.setText(note.body)
    }
}