package com.example.myapplication.TestesAutomatizados

data class Leilao(
    val descricao: String,
    var lances: List<Lance>? = listOf(),
    var maiorLance: Double = Double.MIN_VALUE,
    var menorLance: Double = Double.MAX_VALUE
) {
    fun propoe(lance: Lance) {
        insertAndOrderList(lance)
        calculaMaiorLance(valorLance = lance.valor)
        calculaMenorLance(valorLance = lance.valor)
    }

    private fun insertAndOrderList(lance: Lance) {
        this.lances = lances?.plus(lance)
        this.lances = this.lances?.sortedBy { it.valor }
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