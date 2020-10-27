package com.example.myapplication.designPatterns.ChainOfResponsability

import com.example.myapplication.designPatterns.models.Orcamento

class SemDesconto : Desconto {
    override fun desconta(orcamento: Orcamento): Double {
        return 0.0
    }

    override fun setProximo(proximo: Desconto) {
        // nao tem!
    }
}