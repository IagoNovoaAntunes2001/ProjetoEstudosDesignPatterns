package com.example.myapplication.designPatterns.models

import java.util.*

data class NotaFiscal(
    var id: Int? = null,
    private val razaoSocial: String? = null,
    private val cnpj: String? = null,
    val dataDeEmissao: Calendar? = null,
    val valorBruto: Double? = null,
    val impostos: Double? = null,
    val itens: List<ItemDaNota>? = null,
    val observacoes: String? = null
)