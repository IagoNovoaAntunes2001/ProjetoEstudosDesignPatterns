package com.example.myapplication.Solid.OCP_DIP.example01

import com.example.myapplication.Solid.OCP_DIP.example01.model.Compra

fun mainExampleDip_OCP() {
    val produto = Compra(1200.0, "SAO PAULO")

    val calculadora = CalculadoraDePrecos(TabelaDePrecoPadrao(), FreteCorreio())
    println(calculadora.calcula(produto))
}