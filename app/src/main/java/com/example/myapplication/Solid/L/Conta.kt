package com.example.myapplication.Solid.L

//Princípio da Substituição de Liskov (LSP)
// LSP - Os subtipos devem ser substituíveis pelos seus tipos base

//Diz que “Os subtipos devem ser substituíveis pelos seus tipos base”,
// e que as classes/tipos base podem ser substituídas por qualquer uma das suas subclasses,
// ponderando sobre os cuidados para usar a herança no seu projeto de software.

// O LSP tem como objetivo nos alertar quanto a utilização da herança,
// que é um poderoso mecanismo e deve ser utilizado com extrema parcimônia.
// O princípio é baseado na seguinte premissa:
// Derived classes must be substitutable for their base classes.

abstract class Conta(
    val valor: Double? = 0.0
) {
    abstract fun depositar(valorDeposito: Double?)

    abstract fun sacar(valorSaque: Double?)
}