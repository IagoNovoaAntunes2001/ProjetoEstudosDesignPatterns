package com.example.myapplication.estruturaDeDados.list

data class Prateleira(
    val genero: String,
    val livros: List<Livro>
) {
    fun organizarPorAutor(): List<Livro> {
        return livros.sortedBy { it.author }
    }

    fun organixarPorAnoPublicacao(): List<Livro> {
        return livros.sortedBy { it.dateBook }
    }
}