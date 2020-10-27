package com.example.myapplication.designPatterns.TemplateMethod

import com.example.myapplication.designPatterns.models.Orcamento

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