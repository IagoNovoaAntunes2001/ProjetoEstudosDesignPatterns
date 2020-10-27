package com.example.myapplication.designPatterns.FactoryMethod

import java.lang.RuntimeException
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

class ConnectionFactory(private var typeDB: String? = "mysql") {
    val connection: Connection
        get() = try {
            val conexao: Connection
            val tipoBanco = typeDB
            conexao = if ("mysql" == tipoBanco) {
                DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/banco",
                    "usuario",
                    "senha"
                )
            } else {
                DriverManager.getConnection(
                    "jdbc:postgres://localhost:3306/banco",
                    "usuario",
                    "senha"
                )
            }
            conexao
        } catch (e: SQLException) {
            throw RuntimeException(e)
        }
}