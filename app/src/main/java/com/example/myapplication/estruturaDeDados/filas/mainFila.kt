package com.example.myapplication.estruturaDeDados.filas

import java.util.*

// Fila é uma estrutura de dados onde o primeiro a entrar é o primeiro a sair.
// É como uma fila de banco: o primeiro que chega na fila é o primeiro a ser atendido.

// Uma fila é uma estrutura de dados dinâmica que admite remoção de elementos e
// inserção de novos objetos. O elemento removido é o que está na estrutura há mais tempo.
// Em outras palavras, o primeiro objeto inserido na fila é também o
// primeiro a ser removido.

// Assim como a pilha, o tempo é constante.
// Se usarmos uma lista ligada por baixo dos panos,
// adicionar e remover do começo leva tempo constante.

fun mainFila() {
    val fila = Fila()
    println(fila.vazia())
    // Inserindo
    fila.adiciona(aluno = "Iago")
    println(fila)
    fila.adiciona(aluno = "Caio")
    println(fila)
    // Removendo
    println(fila.remove())
    println(fila)
    // Verificando
    println(fila.vazia())

    println("--------------------------")
    // Fila do java
    val filaDoJava: Queue<String> = LinkedList<String>()
    // Inserção
    filaDoJava.add("Mauricio")
    filaDoJava.add("Caio")
    println(filaDoJava)
    // Remoção
    println(filaDoJava.poll())
    println(filaDoJava)
}