package com.example.myapplication.EstruturaDeDados.SequencialeVetores

import com.example.myapplication.EstruturaDeDados.models.Aluno

fun mainVetor() {
    val n1 = Aluno(nome = "Iago")
    val n2 = Aluno(nome = "Caio")
    val n3 = Aluno(nome = "Paulo")

    val lista = Vetor()
    println(lista.tamanho())
    lista.adiciona(n1)
    println(lista.tamanho())
    lista.adiciona(n2)
    println(lista.tamanho())

    // Testando um aluno que há na lista
    println(lista.contem(n1))

    // Testando um aluno não adicionado
    println(lista.contem(n3))

    // Pegando um aluno de uma posição passada
    println(lista.pega(posicao = 0))

    // Gerando uma exceção caso exceder limite e depois deixando a exceção mais amigável
    // println(lista.pega(posicao = 200))

    // Adicionando na posição da lista desejada
    lista.adiciona(aluno = n3, posicao = 0)

    // Gerando exceção com posição inválida
    // lista.adiciona(aluno = n3, posicao = 300)

    // Removendo uma posição
    lista.remove(posicao = 0)

    // Verificando se o array de fato está garintindo seu tamanho, caso excede-lo.
    for (i in 0..300) {
        val y = Aluno("IagoNovoa$i")
        lista.adiciona(y)
    }
    println(lista)
    println(lista.tamanho())
}