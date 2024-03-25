package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val strId = intent.getStringExtra("idFromSignInActivity")
        val editIdView = findViewById<EditText>(R.id.editId)
        editIdView.setText(strId)

        val finishbtn = findViewById<Button>(R.id.btnFinish)
            finishbtn.setOnClickListener {
                val intent = Intent(this,SignlnActivity::class.java)
                startActivity(intent)
                finish()
            }
    }
}