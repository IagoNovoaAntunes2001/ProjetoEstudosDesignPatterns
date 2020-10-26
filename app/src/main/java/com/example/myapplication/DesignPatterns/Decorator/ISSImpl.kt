package com.example.myapplication.DesignPatterns.Decorator

import com.example.myapplication.DesignPatterns.models.Orcamento

class ISSImpl(outroImposto: Imposto? = null) : Imposto(outroImposto) {
    override fun calcula(orcamento: Orcamento?): Double {
        return orcamento?.valor!! * 0.06 + calculaOutroImposto(orcamento)
    }
}
