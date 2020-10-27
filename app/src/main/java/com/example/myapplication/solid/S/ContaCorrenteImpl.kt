package com.example.myapplication.solid.S

class ContaCorrenteImpl : ContaCorrenteRepository {
    override fun save() {
        println("salvando no db....");
    }
}