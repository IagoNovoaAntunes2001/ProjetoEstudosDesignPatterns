package com.example.myapplication.DesignPatterns.Adapter

import java.util.*

class RelogioImpl : Relogio {
    override fun hoje(): Calendar {
        return Calendar.getInstance()
    }
}
