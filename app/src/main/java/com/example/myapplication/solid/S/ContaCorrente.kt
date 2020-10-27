package com.example.myapplication.solid.S

class ContaCorrente(
    private val contaCorrente: ContaCorrenteRepository
) {
    fun salvarModificacao() {
        contaCorrente.save()
    }
}