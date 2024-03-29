package com.example.registration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val alreadyHaveanAccountTextView = findViewById<TextView>(R.id.alreadyHaveanAccount)
        alreadyHaveanAccountTextView.setOnClickListener {
            // Xử lý khi người dùng nhấn vào TextView "Already Have an Account"
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
