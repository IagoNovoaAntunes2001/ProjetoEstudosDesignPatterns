package com.example.myapplication.estruturaDeDados.list

fun main() {
    val book1 = Livro(title = "Ttulo1", author = "Author1", dateBook = 1959, company = "Editora A")

    val book2 = Livro(title = "Ttulo2", author = "Author2", dateBook = 1948, company = "Editora B")

    val book3 = Livro(title = "Ttulo3", author = "Author3", dateBook = 1927)

    val book4 = Livro(title = "Ttulo4", author = "Author4", dateBook = 1932)

    val book5 = Livro(title = "Ttulo5", author = "Author4", dateBook = 1949)

    val livros = mutableListOf(book1, book2, book3, book4, book5)
    livros.add(
        Livro(
            "Titulo5",
            "Author5",
            2001
        )
    )

    livros.remove(book1)
    livros.imprimeComMarcadores()

    livros.sorted().imprimeComMarcadores()

    livros.sortedBy {
        it.title
    }.imprimeComMarcadores()


    println("####Filtros### \n")

    livros.filter {
        it.author == "Author4"
    }.sortedBy {
        it.dateBook
    }.imprimeComMarcadores()


}

