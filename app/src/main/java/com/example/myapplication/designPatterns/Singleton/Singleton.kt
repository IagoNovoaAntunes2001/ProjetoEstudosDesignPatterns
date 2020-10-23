package com.example.myapplication.designPatterns.Singleton

import com.example.myapplication.designPatterns.models.Servico

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