package com.example.makan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listview)
        val names = arrayOf("Indonesia", "Japan", "England", "America", "Spain")

        val arrayAdapter: ArrayAdapter<String> =ArrayAdapter(
            this,android.R.layout.simple_list_item_1,names
        )

        listView.adapter = arrayAdapter
        // Menangani klik item pada ListView
        listView.setOnItemClickListener { _, _, position, _ ->
            // Ambil item yang diklik
            val selectedItem = names[position]

            // Pindah ke MainActivity2 dan kirim data jika diperlukan
            val pindah = Intent(this@MainActivity, MainActivity2::class.java)
            pindah.putExtra("selectedItem", selectedItem)
            startActivity(pindah)
            finish();
        }
    }
}