package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    public static void main(String[] args) {

        String url = System.getenv("DB_URL");


        try {
            Connection connection = DriverManager
                    .getConnection(url);

            System.out.println("Recuperei a conexão");

            connection.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
