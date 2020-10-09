package com.example.myapplication.designPatterns.Builder

import com.example.myapplication.designPatterns.models.ItemDaNota
import java.util.*

//Sempre que tivermos um objeto complexo de ser criado,
// que possui diversos atributos,
// ou que possui uma lógica de criação complicada,
// podemos esconder tudo isso em um Builder.

//Além de centralizar o código de criação e facilitar a manutenção,
// ainda facilitamos a vida das classes que precisam criar essa classe complexa,
// afinal a interface do Builder tende a ser mais clara e fácil de ser usada.

fun designPatternBuilder() {
    val builder = NotaFiscalBuilder(
        "123", "123123", arrayListOf(
            ItemDaNota(
                "1",
                200.0
            )
        ), 200.0, 50.0, "obs", Calendar.getInstance()
    )
    val notaFiscal = builder.constroi()
    println(notaFiscal.impostos)
}

fun builderItemDaNota() {
    val builder = ItemDaNotaBuilder("Descricao", 200.0)
    val itemDaNota = builder.constroi()
    println(itemDaNota.descricao)
}