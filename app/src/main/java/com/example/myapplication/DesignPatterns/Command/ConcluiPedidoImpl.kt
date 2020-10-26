package com.example.myapplication.DesignPatterns.Command

import com.example.myapplication.DesignPatterns.models.Pedido

class ConcluiPedidoImpl(private val pedido: Pedido) : Comando {
    override fun executa() {
        pedido.finaliza()
    }
}