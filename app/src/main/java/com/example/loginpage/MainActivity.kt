package com.example.loginpage

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.Window
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val btn: Button = findViewById(R.id.button)

        btn.setOnClickListener {
            val intent = Intent(this,ActivityPage::class.java)
            startActivity(intent)
        }
    }
}