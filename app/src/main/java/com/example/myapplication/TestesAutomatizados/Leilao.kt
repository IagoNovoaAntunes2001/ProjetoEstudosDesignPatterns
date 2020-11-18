package com.example.myapplication.TestesAutomatizados

data class Leilao(
    val descricao: String,
    val lances: List<Lance>? = listOf(),
    var maiorLance: Double = Double.MIN_VALUE,
    var menorLance: Double = Double.MAX_VALUE
) {
    fun propoe(lance: Lance) {
        calculaMaiorLance(valorLance = lance.valor)
        calculaMenorLance(valorLance = lance.valor)
    }

    private fun calculaMenorLance(valorLance: Double) {
        if (valorLance < menorLance) {
            menorLance = valorLance
        }
    }

    private fun calculaMaiorLance(valorLance: Double) {
        if (valorLance > maiorLance) {
            maiorLance = valorLance
        }
    }
}