package com.example.myapplication.estruturaDeDados.list

fun main() {
    val prateleira = Prateleira(
        genero = "Ação",
        livros = doingListOfBooks()
    )

    prateleira.organizarPorAutor().imprimeComMarcadores()
    prateleira.organixarPorAnoPublicacao().imprimeComMarcadores()

}

private fun doingListOfBooks(): List<Livro> {
    return listOf(
        Livro(title = "Livro ação 1", author = "Author1", dateBook = 2001),
        Livro(title = "Livro ação 2", author = "Author1", dateBook = 2001),
        Livro(title = "Livro ação 3", author = "Author2", dateBook = 2002),
        Livro(title = "Livro ação 4", author = "Author2", dateBook = 2002),
        Livro(title = "Livro ação 5", author = "Author3", dateBook = 2003),
        Livro(title = "Livro ação 6", author = "Author4", dateBook = 2004)
    )
}