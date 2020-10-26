package com.example.myapplication.DesignPatterns.Observer

import com.example.myapplication.DesignPatterns.models.NotaFiscal

class NotaFiscalDao : AcoesAposGerarNota {
    override fun executa(nf: NotaFiscal) {
        println("salva nf no banco")
    }
}