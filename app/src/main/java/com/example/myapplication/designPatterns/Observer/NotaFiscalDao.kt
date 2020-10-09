package com.example.myapplication.designPatterns.Observer

import com.example.myapplication.designPatterns.models.NotaFiscal

class NotaFiscalDao : AcoesAposGerarNota {
    override fun executa(nf: NotaFiscal) {
        println("salva nf no banco")
    }
}