package com.example.myapplication.designPatterns.Adapter

import java.util.*

class RelogioImpl : Relogio {
    override fun hoje(): Calendar {
        return Calendar.getInstance()
    }
}
