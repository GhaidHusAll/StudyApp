package com.example.studyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var toKotlin : Button
    private lateinit var toAndroid : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toKotlin = findViewById(R.id.btnToKotlin)
        toAndroid = findViewById(R.id.btnToAndroid)
        toKotlin.setOnClickListener {
            val intent = Intent(this, Kotlin::class.java)
            startActivity(intent)
        }
        toAndroid.setOnClickListener {
            val intent = Intent(this, Android::class.java)
            startActivity(intent)
        }
    }
}