package com.example.myapplication.DesignPatterns.models

import com.example.myapplication.DesignPatterns.Interpreter.Expressao

data class Numero(val numero: Int) : Expressao {
    override fun avalia(): Int {
        return this.numero
    }
}