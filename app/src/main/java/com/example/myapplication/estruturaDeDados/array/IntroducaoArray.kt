package com.example.myapplication.estruturaDeDados.array

fun main() {
    criandoArrayeDescobrindoValores()
}

private fun criandoArrayeDescobrindoValores() {
    val idades = intArrayOf(20, 23, 29, 27, 17, 55)

    var maior = Int.MIN_VALUE
    idades.map {
        if (it > maior) {
            maior = it
        }
    }
    println("A maior idade é $maior")


    var menor = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menor) {
            menor = idade
        }
    }
    println("A menor idade é: $menor")
}





