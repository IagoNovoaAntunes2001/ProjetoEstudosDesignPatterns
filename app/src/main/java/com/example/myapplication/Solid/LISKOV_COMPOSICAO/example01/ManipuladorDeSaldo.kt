package com.example.myapplication.Solid.LISKOV_COMPOSICAO.example01


class ManipuladorDeSaldo {

    var saldo = 0.0

    fun deposita(valor: Double) {
        saldo += valor
    }

    fun saca(valor: Double) {
        if (valor <= saldo) {
            saldo -= valor
        } else {
            throw IllegalArgumentException()
        }
    }

    fun rende(taxa: Double) {
        saldo += this.saldo * taxa
    }
}

