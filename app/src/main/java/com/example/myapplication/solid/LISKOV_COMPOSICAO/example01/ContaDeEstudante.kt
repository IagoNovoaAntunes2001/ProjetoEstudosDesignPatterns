package com.example.myapplication.solid.LISKOV_COMPOSICAO.example01

class ContaDeEstudante(private val manipuladorDeSaldo: ManipuladorDeSaldo) {
    var milhas = 0
        private set

    fun deposita(valor: Double) {
        manipuladorDeSaldo.deposita(valor)
        this.milhas += valor.toInt()
    }

    fun saca(valor: Double) {
        manipuladorDeSaldo.saca(valor)
        this.milhas -= valor.toInt()
    }
}

