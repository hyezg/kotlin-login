package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.constraintlayout.widget.ConstraintLayout

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val strId = intent.getStringExtra("idFromSignInActivity")
        val editIdView = findViewById<EditText>(R.id.edit_Id_signIn)
        editIdView.setText(strId)


        val finishBtn = findViewById<ConstraintLayout>(R.id.btn_finish)
        finishBtn.setOnClickListener {
            val intent = Intent(this, SignlnActivity::class.java)
            startActivity(intent)
            finish()
        }
        val id = when((0..6).random()) {
            1 -> R.drawable.and_face

            else -> R.drawable.and_face
        }


    }
}