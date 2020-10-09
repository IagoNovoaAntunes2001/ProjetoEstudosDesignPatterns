package com.example.myapplication.Solid.L

class ContaPoupanca : Conta(), realizaEmprestimo {
    override fun depositar(valorDeposito: Double?) {
        println("REALIZANDO DEPOSITO")
    }

    override fun sacar(valorSaque: Double?) {
        println("REALIZANDO SAQUE")
    }

    override fun empresta(valor: Double): Double {
        println("EMPRESTANDO $valor")
        return valor
    }
}