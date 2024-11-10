package com.example.simpleadapter_tp01

import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //val languages = listOf("Java","C#","Python","Kotlin","Swift")

        val languages = listOf(
            mapOf(
                "name" to "Java",
                "year" to "1995",
                "icon" to R.drawable.java
            ),
            mapOf(
                "name" to "C#",
                "year" to "2000",
                "icon" to R.drawable.sharp
            ),
            mapOf(
                "name" to "Python",
                "year" to "1991",
                "icon" to R.drawable.python
            ),
            mapOf(
                "name" to "Kotlin",
                "year" to "2011",
                "icon" to R.drawable.kotlin
            )
        )

        val listView = findViewById<ListView>(R.id.listView)


        /*val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, languages)
        listView.adapter = adapter*/

        //val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_multiple_choice, languages)
        val adapter = SimpleAdapter(
            this,
            languages,
            R.layout.listview_items,  // Utilisez un layout personnalisé avec une icône
            arrayOf("name", "year", "icon"),
            intArrayOf(R.id.tvLanguageName, R.id.tvYear, R.id.icon)
        )
        listView.adapter = adapter

        // MODE DE SELECTION
        /*listView.choiceMode = ListView.CHOICE_MODE_SINGLE*/

        //listView.choiceMode = ListView.CHOICE_MODE_MULTIPLE


    }
}