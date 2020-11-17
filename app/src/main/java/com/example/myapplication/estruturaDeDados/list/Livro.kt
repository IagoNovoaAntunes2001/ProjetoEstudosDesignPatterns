package com.example.myapplication.estruturaDeDados.list

data class Livro (
    val title: String,
    val author: String,
    val dateBook: Long,
    val company: String? = null
): Comparable<Livro> {
    override fun compareTo(other: Livro): Int {
        return this.dateBook.compareTo(other.dateBook)
    }
}