package com.example.myapplication.Solid.I

//Princípio da Segregação de Interfaces (ISP)
// ISP - Muitas interfaces especificas são melhores que uma geral.abstract

//Esse princípio trata da coesão em interfaces, da construção de módulos enxutos,
// ou seja, com poucos comportamentos.
// Interfaces que possuem muitos comportamentos
// são difíceis de manter e evoluir, e devem ser evitadas.

interface Conta {
    fun depositar(valor: Int)
}
