
package com.example.myapplication.solid.D

class ContaCorrente(var _repository: IPagamentoRepository) {
    fun execultarAlgumaLogica() {
        _repository.save()
    }
}