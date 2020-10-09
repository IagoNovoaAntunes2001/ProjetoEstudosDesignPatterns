package com.example.myapplication.Solid.S

// "Uma classe deve ter apenas um motivo para mudar"
// Sua responsabilidade é sempre em sima de um e apenas um ator.

// Um objeto não pode e deve fazer mais do que é o dominio dele.
// Lembre-se: sua funcionalidade não importa a granularidade (pacote/modulo/classe/metodo/função)
// não deve fazer o que não é proposto, normalmente um Funcionario não deve ser capaz de adicionar um produto em seu dominio,
// um Produto não deve ser capaz de exercer controle sobre o banco de dados, um pacote que diz que faz A não deve fazer B.


interface ContaCorrenteRepository {
    fun save()
}