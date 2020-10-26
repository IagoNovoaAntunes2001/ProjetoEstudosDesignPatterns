package com.example.myapplication.DesignPatterns.TemplateMethod

import com.example.myapplication.DesignPatterns.models.Orcamento

internal class ICPP : TemplateDeImpostoCondicional() {
    override fun deveUsarMaximaTaxacao(orcamento: Orcamento?): Boolean {
        return orcamento!!.valor >= 500
    }

    override fun maximaTaxacao(orcamento: Orcamento?): Double {
        return orcamento!!.valor * 0.07
    }

    override fun minimaTaxacao(orcamento: Orcamento?): Double {
        return orcamento!!.valor * 0.05
    }
}