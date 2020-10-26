package com.example.myapplication.DesignPatterns.Strategy

import com.example.myapplication.DesignPatterns.models.Orcamento

class ISSImpl : Imposto {
    override fun calcula(orcamento: Orcamento): Double {
        return orcamento.valor * 0.06
    }
}