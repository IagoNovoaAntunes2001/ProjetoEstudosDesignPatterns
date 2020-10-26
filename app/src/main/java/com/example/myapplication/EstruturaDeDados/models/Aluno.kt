package com.example.myapplication.EstruturaDeDados.models

data class Aluno(private val nome: String) {
    override fun toString(): String {
        return "Aluno(nome='$nome')"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Aluno

        if (nome != other.nome) return false

        return true
    }

    override fun hashCode(): Int {
        return nome.hashCode()
    }
}