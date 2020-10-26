package com.example.myapplication.DesignPatterns.Bridge

class GoogleMaps : Mapa {
    override fun pegaEndereco(rua: String) {
        println("Serviço de mapa do googlemaps na rua $rua")
    }
}