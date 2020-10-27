package com.example.myapplication.EstruturaDeDados.Pilha

class Pilha {

    private var nomes: MutableList<String> = mutableListOf()

    fun push(nome: String) {
        // Insere na pilha
        nomes.add(nome)
    }

    fun pop(): String {
        // Retira da pilha
        return nomes.removeAt(index = nomes.size - 1)
    }

    fun vazia(): Boolean {
        return nomes.isEmpty()
    }

    override fun toString(): String {
        return nomes.toString()
    }

}