package com.example.myapplication.Solid.S

class ContaCorrente(
    private val contaCorrente: ContaCorrenteRepository
) {
    fun salvarModificacao() {
        contaCorrente.save()
    }
}