package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignlnActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  buttonLogin = findViewById<Button>(R.id.btnLogin)
        buttonLogin.setOnClickListener {
            val intent = Intent(this,)
        }

    }
}