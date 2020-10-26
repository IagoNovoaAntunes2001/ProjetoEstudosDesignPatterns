package com.example.myapplication.DesignPatterns.Decorator

import com.example.myapplication.DesignPatterns.models.Orcamento

abstract class Imposto(private val outroImposto: Imposto? = null) {

    protected fun calculaOutroImposto(orcamento: Orcamento?): Double {
        return outroImposto?.calcula(orcamento) ?: .0
    }

    abstract fun calcula(orcamento: Orcamento?): Double
}