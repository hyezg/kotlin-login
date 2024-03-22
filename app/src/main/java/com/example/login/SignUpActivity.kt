package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)


        val btnfinish = findViewById<Button>(R.id.btnSign)
        btnfinish.setOnClickListener {
            val intent = Intent(this,SignlnActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}