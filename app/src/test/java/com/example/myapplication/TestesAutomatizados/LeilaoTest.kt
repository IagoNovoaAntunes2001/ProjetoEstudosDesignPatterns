package com.example.myapplication.TestesAutomatizados

import org.junit.Assert.assertEquals
import org.junit.Test

class LeilaoTest {

    private var leilao: Leilao = Leilao("Console")
    private var iago: Usuario = Usuario("Iago")

    @Test
    fun getDescricao_QuandoRecebe_DevolveDescricao() {
        assertEquals("Console", leilao.descricao)
    }

    @Test
    fun getMaiorLanc_QuandoRecebeApenasUmLance_DevolveOmaior() {
        this.leilao = Leilao("Console")
        leilao.propoe(Lance(iago, 200.0))

        assertEquals(200.0, leilao.maiorLance, 0.0001)
    }

    @Test
    fun getMaiorLance_QuandoRecebeMaisDeUmLanceEmOrdemCrescente_DevolveMaior() {
        this.leilao = Leilao("Console")
        leilao.propoe(Lance(iago, 100.0))
        leilao.propoe(Lance(Usuario("Dba"), 300.0))

        assertEquals(300.0, leilao.maiorLance, 0.0001)
    }

    @Test
    fun getMaiorLance_QuandoRecebeMaisDeUmLanceEmOrdemDecrescente_DevolveMaior() {
        leilao.propoe(Lance(iago, 300.0))
        leilao.propoe(Lance(Usuario("Cba"), 100.0))

        assertEquals(300.0, leilao.maiorLance, 0.0001)
    }

    @Test
    fun getMenorLanc_QuandoRecebeApenasUmLance_DevolveMenor() {
        leilao.propoe(Lance(iago, 100.0))

        assertEquals(100.0, leilao.menorLance, 0.0001)
    }

    @Test
    fun getMenorLance_QuandoRecebeMaisDeUmLanceEmOrdemCrescente_DevolveMenor() {
        leilao.propoe(Lance(iago, 100.0))
        leilao.propoe(Lance(Usuario("Dba"), 300.0))

        assertEquals(100.0, leilao.menorLance, 0.0001)
    }

    @Test
    fun getMenorLance_QuandoRecebeMaisDeUmLanceEmOrdemDecrescente_DevolveMenor() {
        leilao.propoe(Lance(iago, 300.0))
        leilao.propoe(Lance(Usuario("Cba"), 100.0))

        assertEquals(100.0, leilao.menorLance, 0.0001)
    }
}