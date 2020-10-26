package com.example.myapplication.DesignPatterns.Observer

import com.example.myapplication.DesignPatterns.models.NotaFiscal

class EnviadorDeEmailImpl : AcoesAposGerarNota {
    override fun executa(nf: NotaFiscal) {
        println("envia email da nf " + nf.id)
    }
}