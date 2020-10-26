package com.example.myapplication.DesignPatterns.Decorator

import com.example.myapplication.DesignPatterns.models.Orcamento

class ICMSImpl(outroImposto: Imposto? = null) : Imposto(outroImposto) {
    override fun calcula(orcamento: Orcamento?): Double {
        return orcamento?.valor!! * 0.01 + calculaOutroImposto(orcamento)
    }
}