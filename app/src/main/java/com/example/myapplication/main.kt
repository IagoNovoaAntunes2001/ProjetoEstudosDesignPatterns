package com.example.myapplication

import com.example.myapplication.Solid.O.Pagamento
import com.example.myapplication.Solid.O.PagamentoBoleto
import com.example.myapplication.Solid.O.PagamentoCartao
import com.example.myapplication.Solid.O.PagamentoImposto
import com.example.myapplication.Solid.S.ContaCorrente
import com.example.myapplication.Solid.S.ContaCorrenteImpl

fun main() {
    val contaCorrente = ContaCorrente(ContaCorrenteImpl())
    contaCorrente.salvarModificacao()

    val pagamento: Pagamento = PagamentoBoleto()
    pagamento.pagar()

    val pagamento2: Pagamento = PagamentoCartao()
    pagamento2.pagar()

    val pagamento3: Pagamento = PagamentoImposto()
    pagamento3.pagar()

}

















