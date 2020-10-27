package com.example.myapplication.estruturaDeDados.conjuntos

// Conjuntos são estruturas de dados que não permitem dados repetidos.
// Para garantir que os dados não fiquem repetidos,
// conjuntos fazem uso de funções de hash para espalhar bem os dados,
// e em seguida, varrer o conteúdo de maneira eficiente.

// Essa função de espalhamento, conhecida como função de hash é o segredo.
// Se ela espalhar bem os dados entre as categorias,
// então a busca em um conjunto será extremamente eficiente.

// Em ciência da computação, um conjunto é uma estrutura de dados abstrata
// que pode armazenar certos valores, sem qualquer ordem particular,
// e sem valores repetidos.
// Uma estrutura de dados abstrata é uma coleção,
// ou agregação, de dados. Os dados podem ser booleanos,
// números, caracteres ou outras estruturas de dados.

fun main() {
    val conjunto = Conjunto()
    // Inserção do conjunto
    conjunto.adiciona("Mauricio")
    println(conjunto)
    conjunto.adiciona("Mauricio")
    conjunto.adiciona("Marcelo")
    conjunto.adiciona("Marcela")
    conjunto.adiciona("Iago")
    println(conjunto)

    // Remoção
    conjunto.remove("Marcela")
    println(conjunto)

    println("------------------")

    // Conjunto do java
    val conjuntoDoJava = HashSet<String>()
    conjuntoDoJava.add("Iago")
    conjuntoDoJava.add("Caio")
    conjuntoDoJava.remove("Caio")
    println(conjuntoDoJava)

    // Espalhamento do conjunto do java
    val x = "andhas"
    x.hashCode()
    println(x)
}