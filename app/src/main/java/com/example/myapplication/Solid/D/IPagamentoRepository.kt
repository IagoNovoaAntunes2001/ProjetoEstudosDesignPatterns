package com.example.myapplication.Solid.D

//Princípio da Inversão de Dependências (DIP)
// DIP - Depender de abstrações e não de classes concretas

//Diz que devemos “depender de abstrações e não de classes concretas”.
// Uncle Bob quebra a definição desse princípio em dois sub-itens: ...
// “As abstrações não devem depender de detalhes.
// Os detalhes devem depender das abstrações.

abstract class IPagamentoRepository {
    abstract fun save()
}