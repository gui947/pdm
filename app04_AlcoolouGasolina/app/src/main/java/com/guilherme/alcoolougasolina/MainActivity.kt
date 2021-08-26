package com.guilherme.alcoolougasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


lateinit var rsltCalc: TextView
lateinit var btnCalc: Button
var valGas: Double? = null
var valAlc: Double? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rsltCalc = findViewById(R.id.resultadoCalc)
        btnCalc = findViewById(R.id.btnCalcular)

        btnCalc.setOnClickListener {
            valAlc = findViewById<TextView>(R.id.alcool).text.toString().toDoubleOrNull()
            valGas = findViewById<TextView>(R.id.gasolina).text.toString().toDoubleOrNull()
            CalcularPreco()
        }
    }

    fun CalcularPreco(){
        var result =""

        valAlc?.let {
            valGas?.let {
                var precoT =  valAlc!! / it

                if (precoT < 0.7) {
                    result = "Melhor utilizar o Álcool"
                } else {
                    result = "Melhor utilizar a Gasolina"
                }
            } ?:run {
                result = "Preencha o campo Gasolina"
            }
        } ?:run {
            result = "Preencha o campo Álcool"
        }
        rsltCalc.text = result

    }
}