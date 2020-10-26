package com.example.myapplication.DesignPatterns.State

import com.example.myapplication.DesignPatterns.State.models.Orcamento

internal class Reprovado : EstadoDeUmOrcamento {
    override fun aplicaDescontoExtra(orcamento: Orcamento?) {}
    override fun aprova(orcamento: Orcamento?) {
        throw java.lang.RuntimeException("Orçamento está em estado de reprovação, não pode aprovar agora!")
    }

    override fun reprova(orcamento: Orcamento?) {
        throw java.lang.RuntimeException("Já estou reprovado!")
    }

    override fun finaliza(orcamento: Orcamento?) {
        orcamento!!.estadoAtual = Finalizado()
    }
}