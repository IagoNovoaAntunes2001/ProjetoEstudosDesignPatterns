package com.example.myapplication.solid.I

class ContaPoupanca : Conta {
    override fun depositar(valor: Int) {
        println("DEPOSITANDO $valor")
    }
}
