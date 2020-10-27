package com.example.myapplication.estruturaDeDados.filas

class Fila {

    private var alunos: MutableList<String> = mutableListOf()

    fun adiciona(aluno: String) {
        alunos.add(aluno)
    }

    fun remove() : String {
        return alunos.removeAt(index = 0)
    }

    fun vazia(): Boolean {
        return alunos.isEmpty()
    }

    override fun toString(): String {
        return alunos.toString()
    }

}