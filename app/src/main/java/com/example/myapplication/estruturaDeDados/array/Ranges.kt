package com.example.myapplication.estruturaDeDados.array

fun main() {
    ranges()
}

private fun ranges() {
    val rangeTo: IntRange = 1.rangeTo(10)
    for (i in rangeTo) {
        println(i)
    }

    val numerosPares = 0..100 step 2
    for (numeros in numerosPares) {
        //println(numeros)
    }

    val numerosParesUntil = 2.until(100) step 2
    for (numeros in numerosParesUntil) {
        //println(numeros)
    }

    val numerosParesReverso = 100 downTo 0 step 2
    numerosParesReverso.forEach {
        println(it)
    }

    val intervalo = 1500..5000
    val salario = 4000

    if (salario in intervalo) {
        println("Está dentro")
    } else {
        println("Não está")
    }

    val alfabeto = 'a'..'z'
    val letra = 'k'

    println(letra in alfabeto)
}