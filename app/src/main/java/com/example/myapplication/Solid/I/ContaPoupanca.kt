package com.example.myapplication.Solid.I

class ContaPoupanca : Conta {
    override fun depositar(valor: Int) {
        println("DEPOSITANDO $valor")
    }
}
