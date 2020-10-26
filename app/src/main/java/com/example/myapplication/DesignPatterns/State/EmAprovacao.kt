package com.example.myapplication.DesignPatterns.State

import com.example.myapplication.DesignPatterns.State.models.Orcamento

internal class EmAprovacao : EstadoDeUmOrcamento {
    override fun aplicaDescontoExtra(orcamento: Orcamento?) {
        orcamento!!.valor -= orcamento!!.valor * 0.05
    }

    override fun aprova(orcamento: Orcamento?) {
        // desse estado posso ir para o estado de aprovado
        orcamento!!.estadoAtual = Aprovado()
    }

    override fun reprova(orcamento: Orcamento?) {
        // desse estado posso ir para o estado de reprovado tambem
        orcamento!!.estadoAtual = Reprovado()
    }

    override fun finaliza(orcamento: Orcamento?) {
        // daqui não posso ir direto para finalizado
        throw RuntimeException("Orcamento em aprovação não podem ir para finalizado diretamente")
    }
}