package com.example.gb_3_01h_javatokotlin

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainButton: Button = findViewById(R.id.main_button)
        mainButton.setOnClickListener { mainButtinClick() }
    }

    private fun mainButtinClick() {
        Toast.makeText(this, "Click!", Toast.LENGTH_SHORT).show()
    }
}