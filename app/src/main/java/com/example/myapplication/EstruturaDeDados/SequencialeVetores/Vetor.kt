package com.example.myapplication.EstruturaDeDados.SequencialeVetores

import com.example.myapplication.EstruturaDeDados.models.Aluno


class Vetor {

    private var alunos = arrayOfNulls<Aluno>(100)
    private var totalDeAlunos = 0

    private fun garanteEspaco() {
        if (totalDeAlunos == alunos.size) {
            val novoArray = arrayOfNulls<Aluno>(alunos.size * 2)
            for (i in alunos.indices) {
                novoArray[i] = alunos[i]
            }
            alunos = novoArray
        }
    }

    fun adiciona(aluno: Aluno) {
        this.garanteEspaco()
        this.alunos[totalDeAlunos] = aluno
        totalDeAlunos++
    }

    fun adiciona(posicao: Int, aluno: Aluno ) {
        this.garanteEspaco()
        if (!posicaoValida(posicao)) return throw IllegalArgumentException("posicao invalida");

        run {
            var i = totalDeAlunos - 1
            while (i >= posicao) {
                alunos[i + 1] = alunos[i]
                i -= 1
            }
        }
        alunos[posicao] = aluno
        totalDeAlunos++
    }

    private fun posicaoValida(posicao: Int): Boolean {
        return posicao in 0..totalDeAlunos
    }

    fun pega(posicao: Int): Aluno? {
        if(!posicaoOcupada(posicao)) return throw IllegalArgumentException("Posiçao invalida");
        return alunos[posicao]
    }

    private fun posicaoOcupada(posicao: Int): Boolean {
        return posicao in 0 until totalDeAlunos
    }

    fun remove(posicao: Int) {
        for (i in posicao until totalDeAlunos) {
            alunos[i] = alunos[i + 1]
        }
        totalDeAlunos--
    }

    fun contem(aluno: Aluno?): Boolean {
        for (i in 0 until totalDeAlunos) {
            if (aluno == alunos[i]) {
                return true
            }
        }
        return false
    }

    fun tamanho(): Int {
        //devolve a quantidade de alunos
        return totalDeAlunos
    }

    override fun toString(): String {
        //facilitará na impressão
        return alunos.contentToString()
    }
}