package com.example.myapplication.Solid.O

// Princípio do Aberto/Fechado (OCP)

//Diz que “as entidades de software (classes, módulos, funções etc.)
// devem ser abertas para ampliação, mas fechadas para modificação”.
// De forma mais detalhada, diz que podemos estender o comportamento de uma classe,
// quando for necessário, por meio de herança, interface e composição,
// mas não podemos permitir a abertura dessa classe para fazer pequenas modificações.

// OCP nos informa que  devemos ser capazes de extender um comportamento de classe, sem modificá-lo.
//devemos ser capazer de extender o funcionamento da nossa classe de pagamento ou seja "pagar",
//porem sem modificar a classe existente.


abstract class Pagamento {
    open var valor = 20
    abstract fun pagar()
}