package com.example.myapplication.designPatterns.ChainOfResponsability

import com.example.myapplication.designPatterns.models.Orcamento

interface Desconto {
    fun desconta(orcamento: Orcamento): Double
    fun setProximo(proximo: Desconto)
}