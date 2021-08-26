package com.guilherme.app16_listacompras_rdb_sp

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CompraDAO {
    @Query("SELECT * FROM TB_COMPRAS")
    suspend fun getItens(): List<Compra>

    @Insert
    suspend fun addItens(c: Compra)

    @Delete
    suspend fun deleteItens(c: Compra)
}