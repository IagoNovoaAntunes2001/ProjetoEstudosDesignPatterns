package com.example.myapplication.solid.LISKOV_COMPOSICAO.example01

fun main() {
//    val manipulador = ManipuladorDeSaldo()
//    val iago = ContaComum(manipulador)
//    iago.deposita(200.0)
//    iago.rende(0.10)
//    iago.saca(100.0)
//
//    println(iago.manipuladorDeSaldo.saldo)

    val manipulador = ManipuladorDeSaldo()
    val iago = ContaDeEstudante(manipulador)
    iago.deposita(200.0)
    iago.saca(100.0)

    println(iago.milhas)

}