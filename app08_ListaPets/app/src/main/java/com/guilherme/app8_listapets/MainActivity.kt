package com.guilherme.app8_listapets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rvPets)

        val lista = mutableListOf<Pet>(
            Pet(nome = "Daddy", idade = "2", raca = Raca.cachorro, foto = resources.getDrawable(R.drawable.pug)),
            Pet(nome="cat", idade = "5", raca= Raca.gato, foto = resources.getDrawable(R.drawable.ic_launcher_background))
        )

        rv.adapter = PetAdapter(lista)

        rv.layoutManager = LinearLayoutManager(this)


    }

}