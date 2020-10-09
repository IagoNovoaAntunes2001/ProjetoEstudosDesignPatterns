package com.example.myapplication.designPatterns.Observer.example01

import com.example.myapplication.designPatterns.models.NotaFiscal

interface AcaoAposGerarNota {
    fun executa(notaFiscal: NotaFiscal?)
}
