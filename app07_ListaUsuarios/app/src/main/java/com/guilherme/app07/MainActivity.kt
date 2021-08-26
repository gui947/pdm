package com.guilherme.app07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rvUsuarios)

        val lista = mutableListOf<Usuario>(
            Usuario(nome="Guilherme", email="guilherme@gmail.com", stack= Stack.BACKEND, senioridade= Senioridade.SENIOR, foto=resources.getDrawable(R.drawable.ic_launcher_background)),
            Usuario(nome="Fallen", email="fallen@gmail.com", stack= Stack.FULLSTACK, senioridade= Senioridade.JUNIOR, foto=resources.getDrawable(R.drawable.fallenzin)),
            Usuario(nome="Maria", email="maria@gmail.com", stack= Stack.FRONTEND, senioridade= Senioridade.PLENO)
        )

        rv.adapter = UsuarioAdapter(lista)

        rv.layoutManager = LinearLayoutManager(this)
    }
}