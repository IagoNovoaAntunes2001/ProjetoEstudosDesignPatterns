package com.example.myapplication.DesignPatterns.ChainOfResponsability

import com.example.myapplication.DesignPatterns.models.Item
import com.example.myapplication.DesignPatterns.models.Orcamento

//O padrão Chain of Responsibility cai como uma luva quando temos uma lista de
// comandos a serem executados de acordo com algum cenário em específico,
// e sabemos também qual o próximo cenário que deve ser validado,
// caso o anterior não satisfaça a condição.

// Nesses casos, o Chain of Responsibility nos possibilita a separação de responsabilidades em classes pequenas e enxutas,
// e ainda provê uma maneira flexível e
// desacoplada de juntar esses comportamentos novamente.

fun designChain() {
    val d1: Desconto = DescontoPorCincoItensImpl()
    val d2: Desconto = DescontoPorMaisDeQuinhentosReaisImpl()
    val d3: Desconto = DescontoPorVendaCasada()
    val d4: Desconto = SemDesconto()

    d1.setProximo(d2)
    d2.setProximo(d3)
    d3.setProximo(d4)

    val orcamento = Orcamento(450.0, listOf(
        Item(
            "LAPIS",
            300.0
        ), Item("CANETA", 300.0)
    ))
    println(d1.desconta(orcamento))
}