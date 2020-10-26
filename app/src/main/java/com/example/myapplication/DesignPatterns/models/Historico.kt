package com.example.myapplication.DesignPatterns.models

data class Historico(private val estadosSalvos: MutableList<Estado>? = ArrayList()) {
    fun pega(index: Int): Estado? {
        return estadosSalvos?.get(index)
    }

    fun adiciona(estado: Estado) {
        estadosSalvos?.add(estado)
    }
}