package com.example.myapplication.designPatterns.TemplateMethod

import com.example.myapplication.designPatterns.Strategy.Imposto
import com.example.myapplication.designPatterns.models.Orcamento

abstract class TemplateDeImpostoCondicional : Imposto {

    override fun calcula(orcamento: Orcamento): Double {
        return if (deveUsarMaximaTaxacao(orcamento)) {
            maximaTaxacao(orcamento)
        } else {
            minimaTaxacao(orcamento)
        }
    }

    protected abstract fun deveUsarMaximaTaxacao(orcamento: Orcamento?): Boolean
    protected abstract fun maximaTaxacao(orcamento: Orcamento?): Double
    protected abstract fun minimaTaxacao(orcamento: Orcamento?): Double
}