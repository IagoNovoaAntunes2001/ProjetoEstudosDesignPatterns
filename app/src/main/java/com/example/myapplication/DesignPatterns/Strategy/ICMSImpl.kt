package com.example.myapplication.DesignPatterns.Strategy

import com.example.myapplication.DesignPatterns.models.Orcamento


class ICMSImpl : Imposto {
    override fun calcula(orcamento: Orcamento): Double {
        return orcamento.valor * 0.05 + 50
    }
}