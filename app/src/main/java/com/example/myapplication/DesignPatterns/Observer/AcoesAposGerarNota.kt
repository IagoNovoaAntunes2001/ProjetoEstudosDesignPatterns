package com.example.myapplication.DesignPatterns.Observer

import com.example.myapplication.DesignPatterns.models.NotaFiscal

interface AcoesAposGerarNota {
    fun executa(nf: NotaFiscal)
}