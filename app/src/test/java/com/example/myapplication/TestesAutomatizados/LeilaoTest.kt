package com.example.myapplication.TestesAutomatizados

import org.junit.Assert.assertEquals
import org.junit.Test

class LeilaoTest {

    private val DELTA = 0.0001
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

        assertEquals(200.0, leilao.maiorLance, DELTA)
    }

    @Test
    fun getMaiorLance_QuandoRecebeMaisDeUmLanceEmOrdemCrescente_DevolveMaior() {
        this.leilao = Leilao("Console")
        leilao.propoe(Lance(iago, 100.0))
        leilao.propoe(Lance(Usuario("Dba"), 300.0))

        assertEquals(300.0, leilao.maiorLance, DELTA)
    }

    @Test
    fun getMaiorLance_QuandoRecebeMaisDeUmLanceEmOrdemDecrescente_DevolveMaior() {
        leilao.propoe(Lance(iago, 300.0))
        leilao.propoe(Lance(Usuario("Cba"), 100.0))

        assertEquals(300.0, leilao.maiorLance, DELTA)
    }

    @Test
    fun getMenorLanc_QuandoRecebeApenasUmLance_DevolveMenor() {
        leilao.propoe(Lance(iago, 100.0))

        assertEquals(100.0, leilao.menorLance, DELTA)
    }

    @Test
    fun getMenorLance_QuandoRecebeMaisDeUmLanceEmOrdemCrescente_DevolveMenor() {
        leilao.propoe(Lance(iago, 100.0))
        leilao.propoe(Lance(Usuario("Dba"), 300.0))

        assertEquals(100.0, leilao.menorLance, DELTA)
    }

    @Test
    fun getMenorLance_QuandoRecebeMaisDeUmLanceEmOrdemDecrescente_DevolveMenor() {
        leilao.propoe(Lance(iago, 300.0))
        leilao.propoe(Lance(Usuario("Cba"), 100.0))

        assertEquals(100.0, leilao.menorLance, DELTA)
    }

    @Test
    fun getTresLances_QuandoReceberOsTres_QuandoRecebeExatosTresLances() {
        leilao.propoe(Lance(iago, 300.0))
        leilao.propoe(Lance(Usuario("Caio"), 500.0))
        leilao.propoe(Lance(Usuario("Paulo"), 400.0))

        assertEquals(3, leilao.lances?.size)
        assertEquals( 300.0,  leilao.lances?.get(0)?.valor!!, DELTA)
        assertEquals(400.0, leilao.lances?.get(1)?.valor!!, DELTA)
        assertEquals(500.0, leilao.lances?.get(2)?.valor!!, DELTA)
    }
}