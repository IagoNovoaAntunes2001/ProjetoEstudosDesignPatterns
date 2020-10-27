package com.example.myapplication.estruturaDeDados.array

fun main() {
    salarios()
}

private fun salarios() {
    val salarios = doubleArrayOf(2000.0, 3000.0, 5000.0)

    val aumento = 1.35
    for (indice in salarios.indices) {
        salarios[indice] *= aumento
    }
    println(salarios.contentToString())

    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }

    println(salarios.contentToString())
}