package com.example.myapplication.TestesAutomatizados

data class Leilao(
    val descricao: String,
    var lances: List<Lance>? = listOf(),
    var maiorLance: Double = 0.0,
    var menorLance: Double = 0.0
) {
    fun propoe(lance: Lance) {
        insertAndOrderList(lance)
        if (verifyIfIsTheFirstStep(lance)) return
        calculaMaiorLance(valorLance = lance.valor)
        calculaMenorLance(valorLance = lance.valor)
    }

    private fun verifyIfIsTheFirstStep(lance: Lance): Boolean {
        if (lances?.size == 1) {
            maiorLance = lance.valor
            menorLance = lance.valor
            return true
        }
        return false
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

    fun tresMaioresLances(): List<Lance> {
        var quantidadeMaximaLines = lances?.size
        if (lances?.size!! > 3) quantidadeMaximaLines = 3
        return quantidadeMaximaLines?.let { lances?.subList(0, it) }!!
    }
}