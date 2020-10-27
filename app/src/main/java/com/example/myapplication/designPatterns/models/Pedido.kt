package com.example.myapplication.designPatterns.models

import com.example.myapplication.designPatterns.models.enum.Status
import java.util.*

data class Pedido(val cliente: String, val valor: Double, var status: Status? = null) {
    private var dataFinalizacao: Calendar? = null

    init {
        status = Status.NOVO
    }

    fun paga() {
        println("Pagando pedido e setando status.")
        status = Status.PAGO
    }

    fun getDataFinalizacao(): Calendar? {
        return dataFinalizacao
    }

    fun finaliza() {
        println("Finalizando pedido e setando status.")
        dataFinalizacao = Calendar.getInstance()
        status = Status.ENTREGUE
    }

}