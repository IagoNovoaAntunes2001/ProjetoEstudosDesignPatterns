package com.example.myapplication.estruturaDeDados.listaLigadaEDuplamenteLigada

import com.example.myapplication.estruturaDeDados.models.Celula


class ListaLigada {

    private var totalDeElementos: Int = 0
    private var primeira: Celula? = null
    private var ultima: Celula? = null

    fun adicionaNoComeco(elemento: String) {
        if (totalDeElementos == 0) {
            val nova = Celula(elemento = elemento)
            primeira = nova
            ultima = nova
        } else {
            val nova = Celula(proximo = primeira, elemento = elemento)
            primeira?.anterior = nova
            primeira = nova
        }
        totalDeElementos++
    }

    fun adiciona(elemento: String) {
        if(this.totalDeElementos == 0) {
            adicionaNoComeco(elemento)
        } else {
            val nova = Celula(elemento)
            this.ultima?.proximo = nova
            nova.anterior = ultima
            this.ultima = nova
            this.totalDeElementos++
        }
    }

     fun adiciona(posicao: Int, elemento: String){
         when (posicao) {
             0 -> {
                 adicionaNoComeco(elemento)
             }
             this.totalDeElementos -> {
                 this.adiciona(elemento)
             }
             else -> {
                 val anterior = pegaCelula (posicao - 1)
                 val proxima = anterior?.proximo

                 val nova = Celula(proximo = anterior?.proximo, elemento = elemento)
                 nova.anterior = anterior
                 anterior?.proximo = nova
                 proxima?.anterior = nova
                 this.totalDeElementos++
             }
         }
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

    fun removeDoFim() {
        if (totalDeElementos == 1) return removeDoComeco()

        val penultimo = ultima?.anterior
        penultimo?.proximo = null
        ultima = penultimo
        totalDeElementos--
    }

    fun remove(posicao: Int) {
        when (posicao) {
            0 -> return removeDoComeco()
            totalDeElementos - 1 -> {
                return removeDoFim()
            }
            else -> {
                val anterior = pegaCelula(posicao - 1)
                val atual: Celula? = anterior?.proximo
                val proxima: Celula? = atual?.proximo

                anterior?.proximo = proxima
                proxima?.anterior = anterior

                totalDeElementos--
            }
        }
    }

    fun contem(elemento: String): Boolean {
        var atual = primeira
        while (atual?.proximo != null) {
            if (atual.elemento == elemento) {
                return true
            }
            atual = atual.proximo
        }
        return false
    }

    fun tamanho(): Int {
        return totalDeElementos
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