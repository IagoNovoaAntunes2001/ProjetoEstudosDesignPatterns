package com.example.myapplication.DesignPatterns.Interpreter

class Divisao(
    var esquerda: Expressao,
    var direita: Expressao
) : Expressao {
    override fun avalia(): Int {
        val esquerdaResultado = esquerda.avalia()
        val direitaResultado = direita.avalia()
        if (direitaResultado <= 0) {
            throw RuntimeException("divisão por zero não é permitida")
            return 0
        }
        return esquerdaResultado / direitaResultado
    }
}
