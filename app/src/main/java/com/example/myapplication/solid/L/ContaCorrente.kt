package com.example.myapplication.solid.L

class ContaCorrente : Conta() {
    override fun depositar(valorDeposito: Double?) {
        println("REALIZANDO DEPOSITO")
    }

    override fun sacar(valorSaque: Double?) {
        println("REALIZANDO SAQUE")
    }
}