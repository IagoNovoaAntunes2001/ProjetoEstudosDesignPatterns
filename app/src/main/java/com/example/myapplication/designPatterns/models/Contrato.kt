package com.example.myapplication.designPatterns.models

import java.util.*

data class Contrato(
    private var data: Calendar,
    private var cliente: String,
    var tipo: TipoContrato
) {
    fun avanca() {
        when {
            tipo === TipoContrato.NOVO -> tipo =
                TipoContrato.EM_ANDAMENTO
            tipo === TipoContrato.EM_ANDAMENTO -> tipo =
                TipoContrato.ACERTADO
            tipo === TipoContrato.ACERTADO -> tipo =
                TipoContrato.CONCLUIDO
        }
    }

    fun salvaEstado(): Estado? {
        return Estado(Contrato(data, cliente, tipo))
    }

    fun restaura(estado: Estado) {
        data = estado.estado.data
        cliente = estado.estado.cliente
        tipo = estado.estado.tipo
    }
}