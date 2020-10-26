package com.example.myapplication.DesignPatterns.Singleton

import com.example.myapplication.DesignPatterns.models.Servico

internal object Singleton {
    private var instance: Servico? = null

    fun getInstance(): Servico? {
        if (instance == null) {
            synchronized(this) {
                instance = Servico()
            }
        }
        return instance
    }
}