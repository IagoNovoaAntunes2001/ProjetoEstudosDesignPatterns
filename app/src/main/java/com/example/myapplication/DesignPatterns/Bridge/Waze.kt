package com.example.myapplication.DesignPatterns.Bridge

class Waze : Mapa {
    override fun pegaEndereco(rua: String) {
        println("Pegando endereço pelo waze da rua $rua")
    }
}