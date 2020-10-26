package com.example.myapplication.DesignPatterns.Observer.example01

import java.util.*

// Quando o acoplamento da nossa classe está crescendo,
// ou quando temos diversas ações diferentes a
// serem executadas após um determinado processo,
// podemos implementar o Observer.

// Ele permite que diversas ações sejam executadas de forma transparente
// à classe principal, reduzindo o acoplamento entre essas ações,
// facilitando a manutenção e evolução do código.


fun desginObserverExample01() {
    val NF = NotaFiscalBuilder(
        razaoSocial = "123123123",
        valorBruto = 200.0,
        impostos = 200.0,
        todosItens = mutableListOf(),
        cnpj = "123.123.123",
        observacoes = "obs",
        data = Calendar.getInstance(),
        acoes = mutableListOf(
            NotaFiscalDaoImpl(),
            EnviadorDeEmailImpl(),
            Multiplicador(multiplicador = 5.0)
        )
    ).constroi()

    println(NF.observacoes)
}