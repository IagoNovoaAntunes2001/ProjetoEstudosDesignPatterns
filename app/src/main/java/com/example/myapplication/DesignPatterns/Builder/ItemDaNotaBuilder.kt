package com.example.myapplication.DesignPatterns.Builder

import com.example.myapplication.DesignPatterns.models.ItemDaNota

class ItemDaNotaBuilder(
    val descricao: String? = null,
    val valor: Double? = null
) {
    fun constroi(): ItemDaNota {
        return ItemDaNota(
            descricao!!,
            valor!!
        )
    }
}