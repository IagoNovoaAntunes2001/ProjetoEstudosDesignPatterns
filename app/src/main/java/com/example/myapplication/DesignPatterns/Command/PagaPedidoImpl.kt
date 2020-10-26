package com.example.myapplication.DesignPatterns.Command

import com.example.myapplication.DesignPatterns.models.Pedido

class PagaPedidoImpl(private val pedido: Pedido) : Comando {
    override fun executa() {
        pedido.paga()
    }
}
