package com.example.myapplication.designPatterns.Decorator

import com.example.myapplication.designPatterns.models.Orcamento

//Sempre que percebemos que temos comportamentos que
// podem ser compostos por comportamentos de outras classes envolvidas
// em uma mesma hierarquia, como foi o caso dos impostos,
// que podem ser compostos por outros impostos.
// O Decorator introduz a flexibilidade na composição desses comportamentos,
// bastando escolher no momento da instanciação, quais instancias serão utilizadas
// para realizar o trabalho.

fun main() {
    val impostos: Imposto = ISSImpl(ICMSImpl())
    val orcamento =
        Orcamento(200.0)
    println(impostos.calcula(orcamento))
}
