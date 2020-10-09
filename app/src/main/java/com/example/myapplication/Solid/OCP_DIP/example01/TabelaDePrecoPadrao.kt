package com.example.myapplication.Solid.OCP_DIP.example01

class TabelaDePrecoPadrao : iPreco {
    override fun desconto(valor: Double): Double {
        if (valor > 5000) return 0.03
        return if (valor > 1000) 0.05 else 0.0
    }
}

