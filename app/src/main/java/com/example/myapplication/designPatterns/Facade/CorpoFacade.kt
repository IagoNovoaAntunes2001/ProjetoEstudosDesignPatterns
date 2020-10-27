package com.example.myapplication.designPatterns.Facade

import com.example.myapplication.designPatterns.models.Cabeca
import com.example.myapplication.designPatterns.models.Corpo

class CorpoFacade(private var cabeca: Cabeca, private var corpo: Corpo) {
    fun caracteristicasCorpo() {
        println("Cabeça do corpo tem a cor de cabelo: ${cabeca.corCabelo}")
        println("Corpo tem um total de: ${corpo.numPintas} pintas")
    }
}

