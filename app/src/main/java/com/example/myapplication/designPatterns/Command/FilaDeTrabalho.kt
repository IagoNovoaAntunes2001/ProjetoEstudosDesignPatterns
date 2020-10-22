package com.example.myapplication.designPatterns.Command

class FilaDeTrabalho {
    private var list: MutableList<Comando> = mutableListOf()

    fun adiciona(comando: Comando) {
        this.list.add(comando)
    }

    fun processa() {
        list.map {
            it.executa()
        }
    }

}