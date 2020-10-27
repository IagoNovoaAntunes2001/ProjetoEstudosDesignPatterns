package com.example.myapplication.designPatterns.Interpreter

import com.example.myapplication.designPatterns.models.Numero

// O padrão Interpreter é geralmente útil para interpretar DSLs
// É comum que, ao ler a string (como por exemplo 2+3/4),
// o programa transforme-o em uma melhor estrutura de dados
// (como as nossas classes Expressao)
// e aí interprete essa árvore.
// É um padrão de projeto bem peculiar, e com utilização bem específica.

fun main() {
    val esquerda: Expressao = Multiplicacao(Numero(10), Numero(5))
    val direita: Expressao = Divisao(Numero(5), Numero(1))

    val conta: Expressao = Soma(esquerda, direita)

    val resultado = conta.avalia()
    println(resultado)
}