package com.example.myapplication.designPatterns.Bridge

// A ideia da Bridge é justamente ser uma ponte em dois mundos/sistemas.
// A ideia do Adapter é esconder alguma "sujeira", ou
// adaptar algo que é diferente e não bate com o sistema atual.

// Bridge é um padrão de projeto de software, ou design pattern em inglês,
// utilizado quando é desejável que uma interface (abstração) possa variar
// independentemente das suas implementações. ... Desta forma todas as operações
// de Janela são abstratas e suas implementações são escondidas dos clientes.

// Diferença entre adapter vs bridge

// Em termos de implementação, nenhuma. Em ambas,
// criamos uma interface e criamos uma implementação por baixo.
// A diferença é semântica. A ideia da Bridge é justamente ser uma ponte em
// dois mundos/sistemas. A ideia do Adapter é esconder alguma "sujeira",
// ou adaptar algo que é diferente e não bate com o sistema atual.
// É bem comum inclusive que a interface do Adapter já tenha sido pré-definida
// e já até exista no sistema. Nessa situação, o programador
// vai lá para implementar um "adaptador" para o sistema antigo, de forma a
// caber no modelo já existente.

fun main() {
    val factoryMapa = FactoryMapa()
    factoryMapa.getFactory(type = "G")?.pegaEndereco(rua = "213")
}