package com.example.myapplication.DesignPatterns.Strategy

import com.example.myapplication.DesignPatterns.models.Orcamento

class ICCCImpl : Imposto {
    override fun calcula(orcamento: Orcamento): Double {
        return when {
            orcamento.valor < 1000 -> {
                orcamento.valor * 0.05
            }
            orcamento.valor <= 3000 -> {
                orcamento.valor * 0.07
            }
            else -> {
                orcamento.valor * 0.08 + 30
            }
        }
    }
}