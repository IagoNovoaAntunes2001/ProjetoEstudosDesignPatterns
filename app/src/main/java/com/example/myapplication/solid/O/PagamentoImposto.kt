package com.example.myapplication.solid.O

class PagamentoImposto  : Pagamento() {
    override var valor = 10

    override fun pagar() {
        println("Pagando imposto $valor")
    }
}
