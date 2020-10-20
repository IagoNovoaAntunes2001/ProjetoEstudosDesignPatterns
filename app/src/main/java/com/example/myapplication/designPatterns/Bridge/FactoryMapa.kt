package com.example.myapplication.designPatterns.Bridge

class FactoryMapa {
    private val map: Mapa? = null

    fun getFactory(type: String): Mapa? {
        if (type == "G") {
            return GoogleMaps()
        } else if (type == "W") {
            return Waze()
        }
        return this.map
    }
}