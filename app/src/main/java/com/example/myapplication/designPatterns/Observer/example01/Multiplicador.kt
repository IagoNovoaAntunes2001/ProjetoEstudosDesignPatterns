package com.example.myapplication.designPatterns.Observer.example01

import com.example.myapplication.designPatterns.models.NotaFiscal

class Multiplicador(private var multiplicador: Double = 0.0) : AcaoAposGerarNota {
    override fun executa(notaFiscal: NotaFiscal?) {
        println(notaFiscal?.valorBruto!! * multiplicador)
    }
}