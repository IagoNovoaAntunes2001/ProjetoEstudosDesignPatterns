package com.example.myapplication.Solid.O

class PagamentoBoleto : Pagamento() {
    override fun pagar() {
        println("Pagando boleto $valor")
    }
}


