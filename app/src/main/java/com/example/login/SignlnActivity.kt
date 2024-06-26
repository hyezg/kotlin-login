package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignlnActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        //로그인 버튼 눌렀을 때
        val btnLogin = findViewById<Button>(R.id.btn_Login_signIn)
        btnLogin.setOnClickListener {
            val editId = findViewById<EditText>(R.id.edit_Id_signIn)
            val editPass = findViewById<EditText>(R.id.edit_Passwd_signIn)
            val strId = editId.text.toString()
            val intent = Intent(this, HomeActivity::class.java)

            if (strId.isEmpty() || editPass.text.isEmpty()) {
                Toast.makeText(this, "아이디/비밀번호를 확인해주세요", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "로그인 성공", Toast.LENGTH_SHORT).show()
                intent.putExtra("idFromSignInActivity", strId)
                startActivity(intent)
            }
        }
        //회원가입 버튼 눌렀을 때
        val btnsignUp = findViewById<Button>(R.id.btn_SignUp)
        btnsignUp.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

    }
}