
package com.example.myapplication.Solid.D

class ContaCorrente(var _repository: IPagamentoRepository) {
    fun execultarAlgumaLogica() {
        _repository.save()
    }
}