package com.example.myapplication.estruturaDeDados.listaLigadaEDuplamenteLigada

fun mainListaLigadaEDuplamenteLigada() {
    val lista = ListaLigada()
    // Inserção no começo
    println(lista)
    lista.adicionaNoComeco("Iago")
    println(lista)
    lista.adicionaNoComeco("Caio")
    println(lista)
    lista.adicionaNoComeco("Paulo")
    println(lista)

    // Inserção no fim
    lista.adiciona("Paula")
    println(lista)

    lista.adiciona(1, "Paulo2")
    println(lista)

    // Inserção na posição desejada
    val x = lista.pega(2)
    println(x)
    println(lista.tamanho())

    // Remoção do começo
    println(lista.removeDoComeco())
    println(lista)
}