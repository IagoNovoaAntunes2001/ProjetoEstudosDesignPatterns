package com.example.myapplication.designPatterns.Decorator

import com.example.myapplication.designPatterns.models.Orcamento

class ISSImpl(outroImposto: Imposto? = null) : Imposto(outroImposto) {
    override fun calcula(orcamento: Orcamento?): Double {
        return orcamento?.valor!! * 0.06 + calculaOutroImposto(orcamento)
    }
}
