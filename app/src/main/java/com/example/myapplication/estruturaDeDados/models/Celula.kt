package com.example.myapplication.estruturaDeDados.models

data class Celula(var elemento: String, var anterior: Celula? = null, var proximo: Celula? = null)