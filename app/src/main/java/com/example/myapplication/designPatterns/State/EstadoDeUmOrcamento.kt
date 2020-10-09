package com.example.myapplication.designPatterns.State

import com.example.myapplication.designPatterns.State.models.Orcamento

internal interface EstadoDeUmOrcamento {
    fun aplicaDescontoExtra(orcamento: Orcamento?)
    fun aprova(orcamento: Orcamento?)
    fun reprova(orcamento: Orcamento?)
    fun finaliza(orcamento: Orcamento?)
}