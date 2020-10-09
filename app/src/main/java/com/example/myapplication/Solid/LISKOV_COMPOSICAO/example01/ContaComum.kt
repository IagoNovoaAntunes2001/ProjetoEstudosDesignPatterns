package com.example.myapplication.Solid.LISKOV_COMPOSICAO.example01

class ContaComum(val manipuladorDeSaldo: ManipuladorDeSaldo) {
    fun deposita(valor: Double) {
        manipuladorDeSaldo.deposita(valor)
    }

    fun saca(valor: Double) {
        manipuladorDeSaldo.saca(valor)
    }

    fun rende(taxa: Double) {
        manipuladorDeSaldo.rende(taxa)
    }
}