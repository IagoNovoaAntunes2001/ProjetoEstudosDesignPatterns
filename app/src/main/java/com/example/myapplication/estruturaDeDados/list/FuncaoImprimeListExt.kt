package com.example.myapplication.estruturaDeDados.list

fun List<Livro>.imprimeComMarcadores() {
    val textoFormatado = this.joinToString(separator = "\n") {
        " - ${it.title} de ${it.author}"
    }
    println(" ######## Lista Livros ######## \n $textoFormatado")
}