package com.guilherme.app6_shortbio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Experiencia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_experiencia)
        lateinit var btnVoltar: Button

        btnVoltar = findViewById(R.id.btnVoltar)

        btnVoltar.setOnClickListener {
            val Voltar3 = Intent(
                this@Experiencia,
                MainActivity::class.java
            )
            startActivity(Voltar3)
        }
    }
}