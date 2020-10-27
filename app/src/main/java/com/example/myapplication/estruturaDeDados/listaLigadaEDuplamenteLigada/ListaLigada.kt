package com.example.myapplication.estruturaDeDados.listaLigadaEDuplamenteLigada

import com.example.myapplication.estruturaDeDados.models.Celula

class ListaLigada {

    private var totalDeElementos: Int = 0
    private var primeira: Celula? = null
    private var ultima: Celula? = null

    fun adicionaNoComeco(elemento: String) {
        val nova = Celula(
            elemento,
            primeira
        )
        this.primeira = nova

        if (totalDeElementos == 0) {
            this.ultima = primeira
        }

        totalDeElementos++
    }

    fun adiciona(elemento: String) {
        if (totalDeElementos == 0) return adicionaNoComeco(elemento)

        val nova = Celula(
            elemento = elemento,
            proximo = null
        )
        this.ultima?.proximo = nova
        this.ultima = nova

        totalDeElementos++
    }

    fun adiciona(posicao: Int, elemento: String) {
        if (posicao == 0) return adicionaNoComeco(elemento)

        if (posicao == totalDeElementos) return adiciona(elemento)

        val anterior = pegaCelula(posicao - 1)
        val nova = Celula(
            elemento,
            anterior?.proximo
        )
        anterior?.proximo = nova
        totalDeElementos++
    }

    private fun pegaCelula(posicao: Int): Celula? {
        if (!posicaoOcupada(posicao)) return throw IllegalArgumentException("Posição inexistente")

        var atual = primeira

        for (i in 0 until posicao) {
            atual = atual?.proximo
        }

        return atual
    }

    fun pega(posicao: Int): String? {
        return this.pegaCelula(posicao)?.elemento
    }

    private fun posicaoOcupada(posicao: Int): Boolean {
        return posicao >= 0 && posicao < totalDeElementos
    }

    fun removeDoComeco() {
        if(totalDeElementos == 0) return throw IllegalArgumentException("Lista vazia")

        primeira = primeira?.proximo
        totalDeElementos--

        if (totalDeElementos == 0) this.primeira = ultima
    }

    fun remove(posicao: Int) {
        //val anterior = 
    }

    fun tamanho(): Int {
        return totalDeElementos
    }

    fun contem(): Boolean {
        return false
    }

    override fun toString(): String {
        if (totalDeElementos == 0) return "[]"

        var atual = primeira

        val builder: StringBuilder = StringBuilder("[")

        for (i in 0 until totalDeElementos) {
            builder.append(atual?.elemento)
            builder.append(",")
            atual = atual?.proximo
        }

        builder.append("]")

        return builder.toString()
    }

}