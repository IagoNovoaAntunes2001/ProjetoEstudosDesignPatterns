package com.example.myapplication.Solid.OCP_DIP.example01

class FreteCorreio : iFrete {
    override fun para(cidade: String): Double {
        return if ("SAO PAULO" == cidade.toUpperCase()) {
            15.0
        } else 30.0
    }
}
