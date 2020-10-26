package com.example.myapplication.DesignPatterns.Strategy

import com.example.myapplication.DesignPatterns.models.Orcamento

interface Imposto {
    fun calcula(orcamento: Orcamento): Double
}