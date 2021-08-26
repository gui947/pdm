package com.guilherme.app9_tarefas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rvTarefas)

        val lista = mutableListOf<Tarefa>(
            Tarefa(titulo = "Lavar o carro", desc = "Ah depois eu lavo", importancia = Importancia.suave),
            Tarefa(titulo = "Limpar o quarto", desc = "É necessário", importancia = Importancia.importante),
            Tarefa(titulo = "Lavar a louça", desc = "Mds quantos pratos", importancia = Importancia.urgente)
        )

        rv.adapter = TarefaAdapter(lista)

        rv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)


    }
}