package com.example.myapplication.designPatterns.Builder

import com.example.myapplication.designPatterns.models.ItemDaNota
import com.example.myapplication.designPatterns.models.NotaFiscal
import java.util.*
import kotlin.collections.ArrayList

data class NotaFiscalBuilder(
    private var razaoSocial: String? = null,
    private var cnpj: String? = null,
    private val todosItens: MutableList<ItemDaNota> = ArrayList(),
    private var valorBruto: Double = 0.0,
    private var impostos: Double = 0.0,
    private var observacoes: String? = null,
    private var data: Calendar? = null
) {
    fun constroi(): NotaFiscal {
        return NotaFiscal(
            razaoSocial = razaoSocial!!,
            cnpj = cnpj!!,
            dataDeEmissao = data!!,
            valorBruto = valorBruto,
            impostos = impostos,
            itens = todosItens,
            observacoes = observacoes!!
        )
    }
}