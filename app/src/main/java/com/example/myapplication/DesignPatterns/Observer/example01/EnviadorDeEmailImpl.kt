package com.example.myapplication.DesignPatterns.Observer.example01

import com.example.myapplication.DesignPatterns.models.NotaFiscal

class EnviadorDeEmailImpl : AcaoAposGerarNota {
    override fun executa(notaFiscal: NotaFiscal?) {
        println("enviando por e-mail")
    }
}