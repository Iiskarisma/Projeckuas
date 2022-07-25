package com.example.myappJaviere.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginform)

        var btnIntentDua = findViewById(R.id.btnLogin) as Button

        btnIntentDua.setOnClickListener {
            startActivity(Intent(this, MenuPesan::class.java))
            Toast.makeText(this@MainActivity,"Selamat Datang!", Toast.LENGTH_LONG).show()
        }
    }
}