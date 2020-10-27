package com.example.myapplication.designPatterns.Adapter

// É bem comum inclusive que a interface do Adapter
// já tenha sido pré-definida e já até exista no sistema.
// Nessa situação, o programador vai lá para implementar um "adaptador"
// para o sistema antigo, de forma a caber no modelo já existente.

// A definição oficial do padrão Adapter é:
// “O Padrão Adapter converte uma interface de uma classe para outra interface
// que o cliente espera encontrar. O Adaptador permite que classes com
// interfaces incompatíveis trabalhem juntas”.

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
    val day: Relogio = RelogioImpl()
    println(day.hoje())
}
