package com.example.myapplication.designPatterns.Observer

import com.example.myapplication.designPatterns.models.Fatura

// Quando o acoplamento da nossa classe está crescendo,
// ou quando temos diversas ações diferentes a
// serem executadas após um determinado processo,
// podemos implementar o Observer.

// Ele permite que diversas ações sejam executadas de forma transparente
// à classe principal, reduzindo o acoplamento entre essas ações,
// facilitando a manutenção e evolução do código.

fun designObserver() {
    val fatura = Fatura(
        200.0,
        "iago"
    )

    val acaoEmail = EnviadorDeEmailImpl()
    val acaoNoaFiscal = NotaFiscalDao()

    val gerador = GeradorDeNotaFiscalImpl(listOf(acaoEmail, acaoNoaFiscal))

    println(gerador.gera(fatura = fatura))
}