package com.example.myapplication.DesignPatterns.ChainOfResponsability

import com.example.myapplication.DesignPatterns.models.Orcamento

class DescontoPorMaisDeQuinhentosReaisImpl : Desconto {
    private var proximo: Desconto? = null
    override fun setProximo(proximo: Desconto) {
        this.proximo = proximo
    }

    override fun desconta(orcamento: Orcamento): Double {
        return if (orcamento.valor > 500) {
            orcamento.valor * 0.07
        } else {
            proximo?.desconta(orcamento)!!
        }
    }
}