package com.example.blockdenotas

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BlockActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var guardarButton: Button
        lateinit var convertirButton: Button
        lateinit var firmaButton: Button

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_block)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        guardarButton = findViewById(R.id.guardarButton)
        convertirButton = findViewById(R.id.convertirButton)
        firmaButton = findViewById(R.id.firmaButton)

        guardarButton.setOnClickListener {
            Log.d("guardar", "Click en botón guardar")
        }
        convertirButton.setOnClickListener {
            Log.d("convertir", "Click en botón convertir")
        }
        firmaButton.setOnClickListener {
            Log.d("firma", "Click en botón firma")
        }
    }
}