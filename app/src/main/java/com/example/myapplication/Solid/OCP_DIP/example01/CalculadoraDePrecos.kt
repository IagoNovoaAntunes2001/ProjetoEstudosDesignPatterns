package com.example.myapplication.Solid.OCP_DIP.example01

import com.example.myapplication.Solid.OCP_DIP.example01.model.Compra

class CalculadoraDePrecos(private val iPreco: iPreco, private val iFrete: iFrete) {
    fun calcula(produto: Compra): Double {
        val desconto = iPreco.desconto(produto.valor)
        val frete = iFrete.para(produto.cidade)
        return produto.valor * (1 - desconto) + frete
    }
}