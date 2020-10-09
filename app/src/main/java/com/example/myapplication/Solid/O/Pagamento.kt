package com.example.myapplication.Solid.O

abstract class Pagamento {
    open var valor = 20
    abstract fun pagar()
}