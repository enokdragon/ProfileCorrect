package com.example.profilecorrect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnProfile = findViewById<Button>(R.id.idButtonViewProfile)
        btnProfile.setOnClickListener{
            var intent =Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

    }
}