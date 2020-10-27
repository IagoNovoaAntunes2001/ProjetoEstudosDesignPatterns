package com.example.myapplication.designPatterns.Command

import com.example.myapplication.designPatterns.models.Pedido

class PagaPedidoImpl(private val pedido: Pedido) : Comando {
    override fun executa() {
        pedido.paga()
    }
}
