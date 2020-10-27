package com.example.myapplication.designPatterns.Singleton

// O Singleton nos ajuda a ter uma única instância do objeto ao longo do sistema.

// Singleton é uma classe que permite que apenas uma única instância de si seja criada
// e, geralmente, fornece acesso simples a essa instância.

fun mainDesignSingleton() {
    val a = Singleton.getInstance()
    val b = Singleton.getInstance()

    // Uma única instância, independentemente de onde for chamada.
    println(a)
    println(b)
}