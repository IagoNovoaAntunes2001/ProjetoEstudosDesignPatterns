package com.example.myapplication.DesignPatterns.ChainOfResponsability

import com.example.myapplication.DesignPatterns.models.Orcamento

interface Desconto {
    fun desconta(orcamento: Orcamento): Double
    fun setProximo(proximo: Desconto)
}