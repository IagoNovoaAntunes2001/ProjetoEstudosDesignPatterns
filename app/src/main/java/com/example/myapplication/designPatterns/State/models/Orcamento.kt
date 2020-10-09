package com.example.myapplication.designPatterns.State.models

import com.example.myapplication.designPatterns.State.EmAprovacao
import com.example.myapplication.designPatterns.State.EstadoDeUmOrcamento

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
