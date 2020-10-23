package com.example.myapplication.designPatterns.Facade

import com.example.myapplication.designPatterns.models.Cabeca
import com.example.myapplication.designPatterns.models.Corpo

// O Façade cria uma interface amigável
// para que clientes consigam consumir
// sub-sistemas (ou serviços).

// Um Facade é um objeto que provê uma interface simplificada para um corpo de
// código maior, como por exemplo, uma biblioteca de classes.
// O Padrão Facade é do tipo estrutural.
// Este padrão esconde as complexidades de um sistema maior e provê uma
// interface simplificada ao cliente.


fun mainDesignFacade() {
    val corpoFacade =
        CorpoFacade(cabeca = Cabeca(corCabelo = "Escura"), corpo = Corpo(numPintas = 3))
    corpoFacade.caracteristicasCorpo()
}