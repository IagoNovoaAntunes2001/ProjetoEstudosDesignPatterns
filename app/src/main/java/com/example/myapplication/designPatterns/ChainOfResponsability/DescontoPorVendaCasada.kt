package com.example.myapplication.designPatterns.ChainOfResponsability

import com.example.myapplication.designPatterns.models.Orcamento

class DescontoPorVendaCasada : Desconto {
    private var proximo: Desconto? = null
    override fun desconta(orcamento: Orcamento): Double {
        return if (aconteceuVendaCasada(orcamento)) orcamento.valor * 0.05
        else proximo?.desconta(orcamento)!!
    }

    private fun aconteceuVendaCasada(orcamento: Orcamento): Boolean {
        return existe("CANETA", orcamento) && existe("LAPIS", orcamento)
    }

    private fun existe(nomeItem: String, orcamento: Orcamento): Boolean {
        orcamento.itens?.map {
            if (it.name == nomeItem) return true
        }
        return false
    }

    override fun setProximo(proximo: Desconto) {
        this.proximo = proximo
    }
}