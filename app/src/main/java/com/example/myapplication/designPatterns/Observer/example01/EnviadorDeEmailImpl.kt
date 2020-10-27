package com.example.myapplication.designPatterns.Observer.example01

import com.example.myapplication.designPatterns.models.NotaFiscal

class EnviadorDeEmailImpl : AcaoAposGerarNota {
    override fun executa(notaFiscal: NotaFiscal?) {
        println("enviando por e-mail")
    }
}