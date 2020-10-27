package com.example.myapplication.designPatterns.Strategy

import com.example.myapplication.designPatterns.models.Orcamento

interface Imposto {
    fun calcula(orcamento: Orcamento): Double
}