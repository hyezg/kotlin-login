package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

    val backbtn = findViewById<Button>(R.id.btnFinish)
        backbtn.setOnClickListener {
            val intent = Intent(this,SignlnActivity::class.java)
            startActivity(intent)
        }
    }
}