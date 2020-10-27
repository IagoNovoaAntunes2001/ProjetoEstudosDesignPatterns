package com.example.myapplication.designPatterns.models

import com.example.myapplication.designPatterns.Interpreter.Expressao

data class Numero(val numero: Int) : Expressao {
    override fun avalia(): Int {
        return this.numero
    }
}