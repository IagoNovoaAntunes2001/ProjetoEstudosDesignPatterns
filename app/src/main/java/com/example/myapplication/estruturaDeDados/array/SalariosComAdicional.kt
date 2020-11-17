package com.example.myapplication.estruturaDeDados.array

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val salarios = bigDecimalArrayOf("1500.05", "1500.55", "10000.00", "20000.00")

    println(salarios.contentToString())

    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario -> calculaAumentoRelativo(salario) }
        .toTypedArray()

    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println("Gasto inicial com todos salários: $gastoInicial")

    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }

    println("O gasto total foi de: $gastoTotal")

    val media = salariosComAumento.sorted().takeLast(3).toTypedArray().media()
    println(media)
}

private fun calculaAumentoRelativo(
    salario: BigDecimal
): BigDecimal {
    val aumento = "1.1".toBigDecimal()
    return if (salario < "5000".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }
}


