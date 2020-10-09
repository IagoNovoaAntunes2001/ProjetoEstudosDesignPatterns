package com.example.myapplication.designPatterns.Observer.example01

import com.example.myapplication.designPatterns.models.NotaFiscal

class NotaFiscalDaoImpl : AcaoAposGerarNota {
    override fun executa(nf: NotaFiscal?) {
        println("salvando no banco")
    }
}
