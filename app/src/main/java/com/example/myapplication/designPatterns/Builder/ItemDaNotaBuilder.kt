package com.example.myapplication.designPatterns.Builder

import com.example.myapplication.designPatterns.models.ItemDaNota

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