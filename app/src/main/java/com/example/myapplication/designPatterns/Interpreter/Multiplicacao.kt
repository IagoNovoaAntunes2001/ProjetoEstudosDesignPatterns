package com.example.myapplication.designPatterns.Interpreter

class Multiplicacao(
    var esquerda: Expressao,
    var direita: Expressao
) : Expressao {
    override fun avalia(): Int {
        val esquerdaResultado = esquerda.avalia()
        val direitaResultado = direita.avalia()
        return esquerdaResultado * direitaResultado
    }
}


