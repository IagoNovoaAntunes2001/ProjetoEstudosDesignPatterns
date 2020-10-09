package com.example.myapplication.Solid.O

// OCP nos informa que  devemos ser capazes de extender um comportamento de classe, sem modificá-lo.

//devemos ser capazer de extender o funcionamento da nossa classe de pagamento ou seja "pagar",
//porem sem modificar a classe existente.


abstract class Pagamento {
    open var valor = 20
    abstract fun pagar()
}