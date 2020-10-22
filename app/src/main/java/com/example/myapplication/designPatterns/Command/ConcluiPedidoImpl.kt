package com.example.myapplication.designPatterns.Command

import com.example.myapplication.designPatterns.models.Pedido

class ConcluiPedidoImpl(private val pedido: Pedido) : Comando {
    override fun executa() {
        pedido.finaliza()
    }
}