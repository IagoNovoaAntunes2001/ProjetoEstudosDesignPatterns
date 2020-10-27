package com.example.myapplication.solid.O

class PagamentoBoleto : Pagamento() {
    override fun pagar() {
        println("Pagando boleto $valor")
    }
}


