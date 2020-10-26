package com.example.myapplication.DesignPatterns.Observer.example01

import com.example.myapplication.DesignPatterns.models.NotaFiscal

class Multiplicador(private var multiplicador: Double = 0.0) : AcaoAposGerarNota {
    override fun executa(notaFiscal: NotaFiscal?) {
        println(notaFiscal?.valorBruto!! * multiplicador)
    }
}