package com.example.gb_3_01h_javatokotlin

object MockNotesRepository {
    private val noteList: List<Note> = listOf(
        Note("Заметка 1", "Текст первой заметки из репозитория"),
        Note("Заметка 2", "Вторая заметка из репозитория с каким-то текстом"),
        Note("Заметка 3", "Тут будет третья заметка из репозитория"),
    )

    fun getNotesList(): List<Note> {
        return noteList
    }
}