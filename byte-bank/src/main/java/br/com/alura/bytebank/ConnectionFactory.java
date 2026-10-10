package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

        String url = System.getenv("DB_URL");

        public Connection recuperarConexao() {
            try {
                return DriverManager
                        .getConnection(url);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
