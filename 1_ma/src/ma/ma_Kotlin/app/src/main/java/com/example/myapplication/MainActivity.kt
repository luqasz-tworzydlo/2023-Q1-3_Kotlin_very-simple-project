package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// zaimportowanie danych
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // zadeklarowanie zmiennej
    // [ jeśli zmienna nie ma przypisanej wartości
    // to wtedy zamiast val wpisujemy lateinit var ]

    lateinit var button: Button
    lateinit var name: EditText
    lateinit var wynik: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // zadeklarowanie wartościn
        name = findViewById(R.id.imie)
        button = findViewById(R.id.button)
        wynik = findViewById(R.id.wynik)

        // dodanie zdarzenia do button
        button.setOnClickListener{
            val imieTxt = name.text

            wynik.text = "Witaj " + imieTxt
        }
    }
}