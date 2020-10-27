package com.example.myapplication.designPatterns.Observer

import com.example.myapplication.designPatterns.models.NotaFiscal

class EnviadorDeEmailImpl : AcoesAposGerarNota {
    override fun executa(nf: NotaFiscal) {
        println("envia email da nf " + nf.id)
    }
}