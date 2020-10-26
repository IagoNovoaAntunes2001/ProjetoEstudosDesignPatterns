package com.example.myapplication.DesignPatterns.TemplateMethod

import com.example.myapplication.DesignPatterns.Strategy.Imposto
import com.example.myapplication.DesignPatterns.models.Orcamento

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