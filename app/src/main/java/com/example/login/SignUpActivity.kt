package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btnfinish = findViewById<Button>(R.id.btn_SignUp)

        btnfinish.setOnClickListener {
            val editName = findViewById<EditText>(R.id.edit_Name_signUp)
            val editId = findViewById<EditText>(R.id.edit_Id_signUp)
            val editPass = findViewById<EditText>(R.id.edit_Passwd_signUp)
            if (editName.text.toString().isEmpty()
                || editId.text.toString().isEmpty()
                || editPass.text.toString().isEmpty()
            ) {
                Toast.makeText(this, "입력되지 않은 정보가 있습니다.", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, SignlnActivity::class.java)
                Toast.makeText(this, "회원가입에 성공했습니다.", Toast.LENGTH_SHORT).show()
                startActivity(intent)
                finish()
            }
        }
    }
}