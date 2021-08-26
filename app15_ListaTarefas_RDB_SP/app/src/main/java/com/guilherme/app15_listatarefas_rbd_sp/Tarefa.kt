package com.guilherme.app15_listatarefas_rbd_sp

import androidx.room.*

@Entity(tableName = "TB_TAREFA")
data class Tarefa(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    @ColumnInfo(name = "Nome")
    var nome: String
)