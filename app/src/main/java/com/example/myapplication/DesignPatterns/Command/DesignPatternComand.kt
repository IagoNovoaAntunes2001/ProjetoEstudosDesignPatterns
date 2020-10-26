package com.example.myapplication.DesignPatterns.Command

import com.example.myapplication.DesignPatterns.models.Pedido

// O Pattern Command encapsula uma solicitação como um objeto,
// o que permite parametrizar outros objetos com diferentes solicitações,
// enfileirando, registrando solicitações e implementando recursos de
// cancelamento de operações.

// A ideia do Command é abstrair um comando que deve ser executado,
// pois não é possível executá-lo naquele momento (pois precisamos
// por em uma fila ou coisa do tipo).

fun designPatternCommand() {
    val pedido1 = Pedido("Iago", 200.0)
    val pedido2 = Pedido("Iago", 250.0)

    println(pedido1.status)
    val fila = FilaDeTrabalho()
    fila.adiciona(PagaPedidoImpl(pedido1))
    fila.adiciona(ConcluiPedidoImpl(pedido1))
    fila.processa()
    println(pedido1.status)
}