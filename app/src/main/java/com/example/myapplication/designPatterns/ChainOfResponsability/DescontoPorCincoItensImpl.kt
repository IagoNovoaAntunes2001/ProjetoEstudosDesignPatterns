package com.example.myapplication.designPatterns.ChainOfResponsability

import com.example.myapplication.designPatterns.models.Orcamento

class DescontoPorCincoItensImpl : Desconto {
    private var proximo: Desconto? = null
    override fun setProximo(proximo: Desconto) {
        this.proximo = proximo
    }

    override fun desconta(orcamento: Orcamento): Double {
        return if (orcamento.itens?.size!! > 5) {
            orcamento.valor * 0.1
        } else {
            proximo?.desconta(orcamento)!!
        }
    }
}