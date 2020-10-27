package com.example.myapplication.estruturaDeDados.listaLigadaEDuplamenteLigada

// Listas ligadas

// Uma lista encadeada é uma representação de uma sequência de objetos,
// todos do mesmo tipo, na memória RAM (random access memory) do computador.
// Cada elemento da sequência é armazenado em uma célula da lista:
// o primeiro elemento na primeira célula, o segundo na segunda, e assim por diante.

// Lista duplamente ligadas

// Em ciência da computação, uma lista duplamente ligada
// (ou lista duplamente encadeada) é uma estrutura de dados ligada que
// consiste de um conjunto de registros sequencialmente ligados chamados de nós e é uma
// extensão da lista simplesmente ligada (ou lista simplesmente encadeada).


// Diferenças

// Na lista ligada simples a célula só aponta para a próxima célula da lista.
// Já na lista duplamente ligada, a célula tem referências para a anterior e para
// a próxima. A grande vantagem é que muitas operações necessitam também
// da célular anterior, e tudo fica mais fácil com a referência armazenada em cada célula.

fun main() {
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
    lista.removeDoComeco()
    println(lista)

    // Remoção do fim
    lista.removeDoFim()
    println(lista)

    // Remoção passando uma posição
    lista.remove(1)
    println(lista)

    // Verificando se há um elemento na lista
    println(lista.contem("Caio"))
    println(lista.contem("Abobora"))

}