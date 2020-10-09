package com.example.myapplication.designPatterns.TemplateMethod

import com.example.myapplication.designPatterns.models.Item
import com.example.myapplication.designPatterns.models.Orcamento

//Quando temos diferentes algoritmos que possuem estruturas parecidas,
// o Template Method é uma boa solução. Com ele, conseguimos definir,
// em um nível mais macro, a estrutura do algoritmo e deixar "buracos",
// que serão implementados de maneira diferente por cada
// uma das implementações específicas.

//Dessa forma, reutilizamos ao invés de repetirmos código,
// e facilitamos possíveis evoluções, tanto do algoritmo em sua estrutura macro,
// quanto dos detalhes do algoritmo, já que cada classe tem
// sua responsabilidade bem separada.

fun designTemplateMethod() {
    val ICPP = ICPP()
    println(ICPP.calcula(Orcamento(400.0, listOf(Item("LAPIS", 600.0)))))

    val IKCV = IKCV()
    println(IKCV.calcula(Orcamento(400.0, listOf(Item("LAPIS", 600.0)))))
}