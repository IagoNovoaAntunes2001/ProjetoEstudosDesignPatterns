package com.example.myapplication.estruturaDeDados.conjuntos

import java.util.*

class Conjunto {

    private var tabela: MutableList<LinkedList<String>> = mutableListOf()

    init {
        for(item: Int in 0..26) {
            tabela.add(LinkedList())
        }
    }

    fun adiciona(palavra: String) {
        if (!contem(palavra)) {
            val indice: Int = calculaIndiceDaTabela(palavra)
            val lista = tabela[indice]
            lista.add(palavra)
        }
    }

    fun remove(palavra: String) {
        if (contem(palavra)) {
            val indice: Int = calculaIndiceDaTabela(palavra)
            val lista = tabela[indice]
            lista.remove(palavra)
        }
    }

    private fun contem(palavra: String): Boolean {
        val indice: Int = calculaIndiceDaTabela(palavra)
        return tabela[indice].contains(palavra)
    }

    private fun calculaIndiceDaTabela(palavra: String): Int {
        return palavra.toLowerCase()[0].toInt() % 26
    }

    override fun toString(): String {
        return tabela.toString()
    }

}