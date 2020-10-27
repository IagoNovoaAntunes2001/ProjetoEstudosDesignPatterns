package com.example.myapplication.EstruturaDeDados.Pilha

import java.util.*

// Pilha é uma estrutura de dados na qual o último elemento
// a entrar é o primeiro a sair,
// também conhecida como LIFO(Last-In First-Out), por exemplo, uma pilha de pratos.

// São estruturas de dados do tipo LIFO (last-in first-out), onde o último elemento
// a ser inserido, será o primeiro a ser retirado. Assim, uma pilha permite acesso
// a apenas um item de dados - o último inserido.
// Para processar o penúltimo item inserido, deve-se remover o último.

// A inserção e remoção é constante. Afinal, ao se usar uma lista ligada por baixo,
// sabemos que a inserção e a remoção do último elemento gasta tempo constante
// (basta acertar as referências).

fun mainPilha() {
    val pilha = Pilha()
    // Inserção na pilha
    pilha.push(nome = "Iago")
    println(pilha)
    pilha.push(nome = "Caio")
    println(pilha)

    // Remoção do último indice retirado da pilha
    val r1 = pilha.pop()
    println(r1)

    val r2 = pilha.pop()
    println(r2)

    // Verificano se a pilha está vazia.
    println(pilha.vazia())
    pilha.push(nome = "Paulo")
    println(pilha.vazia())

    println(pilha)


    // Classe própria do Java/kotlin de pilha
    val stack = Stack<String>()

    // Inserção
    stack.push("Iago")
    stack.push("Caio")

    println(stack)
    // Remoção
    println(stack.pop())
    // Indica o último indice (Igual ao pop, porém não remove.)
    println(stack.peek())
    println(stack)

    println("-------------------------")
    val pilha2 = Pilha()
    pilha2.push(nome = "Mauricio")
    pilha2.push(nome = "Marcelo")
    println(pilha2.pop())
    pilha2.push(nome = "Guilherme")
    pilha2.push(nome = "Paulo")
    println(pilha2.pop())
    pilha2.push(nome = "João")
    println(pilha2)
}

