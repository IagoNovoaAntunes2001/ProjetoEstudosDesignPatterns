package com.example.myapplication.solid.I

class ContaCorrente : CestaDeServicos(), Conta {
    override fun depositar(valor: Int) {
        println("DEPOSITANDO $valor")
    }

    override fun transferir(valor: Int) {
        println("Transferindo $valor")
    }

    override fun realizarEmprestimo() {
        println("Realizando emprestimo")
    }
}