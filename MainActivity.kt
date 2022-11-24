package com.example.polihack2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonlogin = findViewById(R.id.buttonlogin) as Button
        buttonlogin.setOnClickListener{
            intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}