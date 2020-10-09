package com.example.myapplication.designPatterns.Observer

import com.example.myapplication.designPatterns.models.NotaFiscal

interface AcoesAposGerarNota {
    fun executa(nf: NotaFiscal)
}