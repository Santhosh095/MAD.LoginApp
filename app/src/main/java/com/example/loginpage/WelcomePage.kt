package com.example.loginpage

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class WelcomePage : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_page)
        supportActionBar?.hide()
        supportActionBar?.setDisplayShowTitleEnabled(false)

        val userId: TextView = findViewById(R.id.textView)
        val pass: TextView = findViewById(R.id.textView2)
        val mainUserId = intent.getStringExtra("username")
        val mainPass = intent.getStringExtra("password")
        val logout: Button = findViewById(R.id.logout)

        userId.text = "Welcome, $mainUserId"
        pass.text = "Your pass: $mainPass"

        logout.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}