package com.example.myapplication.solid.O

class PagamentoCartao   : Pagamento() {
    override fun pagar() {
        println("Pagando cartão $valor")
    }
}