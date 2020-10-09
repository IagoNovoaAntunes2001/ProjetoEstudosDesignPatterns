package com.example.myapplication.Solid.I

class ContaConjunto : Conta {
    override fun depositar(valor: Int) {
        println("DEPOSITANDO $valor")
    }
}
