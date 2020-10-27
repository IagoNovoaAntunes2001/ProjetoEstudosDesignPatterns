package com.example.myapplication.solid.I

class ContaConjunto : Conta {
    override fun depositar(valor: Int) {
        println("DEPOSITANDO $valor")
    }
}
