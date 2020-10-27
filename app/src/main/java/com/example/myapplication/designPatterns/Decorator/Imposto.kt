package com.example.myapplication.designPatterns.Decorator

import com.example.myapplication.designPatterns.models.Orcamento

abstract class Imposto(private val outroImposto: Imposto? = null) {

    protected fun calculaOutroImposto(orcamento: Orcamento?): Double {
        return outroImposto?.calcula(orcamento) ?: .0
    }

    abstract fun calcula(orcamento: Orcamento?): Double
}