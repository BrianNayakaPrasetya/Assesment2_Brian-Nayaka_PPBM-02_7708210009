package com.example.makan

import android.annotation.SuppressLint
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
class MainActivity2 : AppCompatActivity() {
    val language = arrayOf<String>("C","C++","Java")
    val description = arrayOf<String>(
        "TEST1 description",
        "TEST2 description",
        "TEST3 description",)

    val imageId = arrayOf<Int>(
        R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background
    )
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById(R.id.listView2) as ListView
        val myListAdapter = MyListAdapter(this,language,description,imageId)
        listView.adapter = myListAdapter

        listView.setOnItemClickListener(){adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            Toast.makeText(this, "Click on item at $itemAtPos its item id $itemIdAtPos", Toast.LENGTH_LONG).show()
        }
    }

}