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
    }

    private fun mainButtonClick(note: Note) {
        val mainTitle: TextView = findViewById(R.id.main_title)
        val mainBody: TextView = findViewById(R.id.main_body)

        mainTitle.setText(note.title)
        mainBody.setText(note.body)
    }
}