package com.example.myapplication.designPatterns.TemplateMethod

import com.example.myapplication.designPatterns.models.Orcamento

internal class IKCV : TemplateDeImpostoCondicional() {
    override fun deveUsarMaximaTaxacao(orcamento: Orcamento?): Boolean {
        return orcamento!!.valor > 500 && temItemMaiorQue100ReaisNo(orcamento)
    }

    override fun maximaTaxacao(orcamento: Orcamento?): Double {
        return orcamento!!.valor * 0.10
    }

    override fun minimaTaxacao(orcamento: Orcamento?): Double {
        return orcamento!!.valor * 0.06
    }

    private fun temItemMaiorQue100ReaisNo(orcamento: Orcamento?): Boolean {
        for (item in orcamento!!.itens!!) {
            if (item.valor > 100) return true
        }
        return false
    }
}