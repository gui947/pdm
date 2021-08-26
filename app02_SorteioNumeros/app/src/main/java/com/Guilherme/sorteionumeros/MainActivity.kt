package com.Guilherme.sorteionumeros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var texto: TextView
    lateinit var botaoSortear: Button
    var numeroSorteado: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        texto = findViewById(R.id.txtNumero)
        botaoSortear = findViewById(R.id.btnSortear)
        botaoSortear.setOnClickListener {
            SortearNumero()
        }
    }

        fun SortearNumero() {

            numeroSorteado = Random().nextInt(11)

            texto.text = "O número é: $numeroSorteado"
        }
    }


