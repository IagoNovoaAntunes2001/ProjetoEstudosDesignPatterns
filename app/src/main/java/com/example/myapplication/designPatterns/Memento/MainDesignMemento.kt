package com.example.myapplication.designPatterns.Memento

import com.example.myapplication.designPatterns.models.Contrato
import com.example.myapplication.designPatterns.models.Historico
import com.example.myapplication.designPatterns.models.TipoContrato
import java.util.*

// Memento é um padrão de projeto de software documentado no Catálogo Gang of Four,
// sendo considerado como um padrão comportamental.
// Ele permite armazenar o estado interno de um objeto em um determinando momento,
// para que seja possível retorná-lo a este estado,
// sem que isso cause problemas com o encapsulamento.


fun main() {
    val historico = Historico()

    val contrato1 = Contrato(Calendar.getInstance(), "Iago", TipoContrato.NOVO)
    historico.adiciona(contrato1.salvaEstado()!!)

    contrato1.avanca()
    historico.adiciona(contrato1.salvaEstado()!!)

    contrato1.avanca()
    historico.adiciona(contrato1.salvaEstado()!!)

    println(contrato1.tipo)
    contrato1.restaura(historico.pega(1)!!)
    println(contrato1.tipo)
}