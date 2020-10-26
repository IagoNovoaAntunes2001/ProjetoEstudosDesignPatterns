package com.example.myapplication.DesignPatterns.Observer.example01

import com.example.myapplication.DesignPatterns.models.NotaFiscal

class NotaFiscalDaoImpl : AcaoAposGerarNota {
    override fun executa(nf: NotaFiscal?) {
        println("salvando no banco")
    }
}
