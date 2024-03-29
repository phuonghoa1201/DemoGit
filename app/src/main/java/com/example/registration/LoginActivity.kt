package com.example.registration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val signUpTextView = findViewById<TextView>(R.id.textviewSignUp)
        signUpTextView.setOnClickListener {
            // Xử lý khi người dùng nhấn vào TextView "Sign Up"
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}