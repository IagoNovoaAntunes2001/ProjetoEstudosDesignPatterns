package com.example.myapplication.solid.OCP_DIP.example01

import com.example.myapplication.solid.OCP_DIP.example01.model.Compra

fun main() {
    val produto = Compra(1200.0, "SAO PAULO")

    val calculadora = CalculadoraDePrecos(TabelaDePrecoPadrao(), FreteCorreio())
    println(calculadora.calcula(produto))
}