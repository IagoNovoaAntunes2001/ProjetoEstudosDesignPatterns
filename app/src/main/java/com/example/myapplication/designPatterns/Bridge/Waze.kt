package com.example.myapplication.designPatterns.Bridge

class Waze : Mapa {
    override fun pegaEndereco(rua: String) {
        println("Pegando endereço pelo waze da rua $rua")
    }
}