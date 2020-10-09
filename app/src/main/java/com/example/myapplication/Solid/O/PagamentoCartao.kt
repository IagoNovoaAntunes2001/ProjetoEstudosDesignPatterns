package com.example.myapplication.Solid.O

class PagamentoCartao   : Pagamento() {
    override fun pagar() {
        println("Pagando cartão $valor")
    }
}