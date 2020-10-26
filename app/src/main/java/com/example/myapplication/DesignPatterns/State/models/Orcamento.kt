package com.example.myapplication.DesignPatterns.State.models

import com.example.myapplication.DesignPatterns.State.EmAprovacao
import com.example.myapplication.DesignPatterns.State.EstadoDeUmOrcamento

internal class Orcamento(
    var valor: Double = 0.0
) {
    var estadoAtual: EstadoDeUmOrcamento

    fun aplicaDescontoExtra() {
        estadoAtual.aplicaDescontoExtra(this)
    }

    fun aprova() {
        estadoAtual.aprova(this)
    }

    fun reprova() {
        estadoAtual.reprova(this)
    }

    fun finaliza() {
        estadoAtual.finaliza(this)
    }

    init {
        estadoAtual =
            EmAprovacao()
    }
}
