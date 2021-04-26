package com.example.hellozuriworld

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addition()

        }
    private fun addition(){
        val display = findViewById<TextView>(R.id.display_number)
        val add = findViewById<Button>(R.id.increment_button)
        var count = 0
        add.setOnClickListener{
            count++
            display.text = count.toString()
        }

    }
}