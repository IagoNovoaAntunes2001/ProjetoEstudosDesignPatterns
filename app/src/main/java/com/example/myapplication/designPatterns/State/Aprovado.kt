package com.example.myapplication.designPatterns.State

import com.example.myapplication.designPatterns.State.models.Orcamento

internal class Aprovado : EstadoDeUmOrcamento {
    override fun aplicaDescontoExtra(orcamento: Orcamento?) {
        orcamento!!.valor -= orcamento!!.valor * 0.02
    }

    override fun aprova(orcamento: Orcamento?) {
        throw java.lang.RuntimeException("Orçamento já está em estado de aprovação")
    }

    override fun reprova(orcamento: Orcamento?) {
        throw java.lang.RuntimeException("Orçamento está em estado de aprovação e não pode ser reprovado")
    }

    override fun finaliza(orcamento: Orcamento?) {
        orcamento!!.estadoAtual = Finalizado()
    }
}
