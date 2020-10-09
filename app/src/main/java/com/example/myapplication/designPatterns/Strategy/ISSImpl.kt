package com.example.myapplication.designPatterns.Strategy

import com.example.myapplication.designPatterns.models.Orcamento

class ISSImpl : Imposto {
    override fun calcula(orcamento: Orcamento): Double {
        return orcamento.valor * 0.06
    }
}