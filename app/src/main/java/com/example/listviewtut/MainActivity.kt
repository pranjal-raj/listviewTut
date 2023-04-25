package com.example.listviewtut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listview = findViewById<ListView>(R.id.list)
        val names = arrayOf(
            "Pranjal", "Aryan","Pranjal", "Aryan","Pranjal", "Aryan","Pranjal",
            "Aryan","Pranjal", "Aryan","Shubh", "Aarav","Shubh", "Aarav","Shubh",
            "Aarav","Shubh", "Aarav","Shubh", "Aarav").asList()

        val adapter : ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, names )
        listview.adapter = adapter




    }
}