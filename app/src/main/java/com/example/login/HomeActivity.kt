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
        val editIdView = findViewById<EditText>(R.id.edit_Id_signIn)
        editIdView.setText(strId)


        val finishBtn = findViewById<Button>(R.id.btn_Finish)
        finishBtn.setOnClickListener {
            val intent = Intent(this, SignlnActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}