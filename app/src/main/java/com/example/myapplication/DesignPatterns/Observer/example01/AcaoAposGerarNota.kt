package com.example.myapplication.DesignPatterns.Observer.example01

import com.example.myapplication.DesignPatterns.models.NotaFiscal

interface AcaoAposGerarNota {
    fun executa(notaFiscal: NotaFiscal?)
}
