package com.example.myapplication.estruturaDeDados.array

fun main() {
    funcoesDeAgregacao()
}

private fun funcoesDeAgregacao() {
    val idades = intArrayOf(10, 30, 40, 50)
    println("Maior idade é: ${idades.max()}")

    println("Menor idade é: ${idades.min()}")

    println("A media de idade dos alunos é: ${idades.average()}")

    val todosMaiores = idades.all {
        it >= 18
    }

    println("Todos são maiores que 18? $todosMaiores")

    val algumMaiorQueDezoito = idades.any {
        it >= 18
    }

    println("Alguem tem mais que 18? $algumMaiorQueDezoito")

    val maioresQueDezoito = idades.filter {
        it >= 18
    }

    println("Os maiores: $maioresQueDezoito")


    val busca = idades.find {
        it >= 18
    }

    println("Busca: $busca")
}