package com.mycompany.atividadea3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBDD {
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "db_vendasdecarros";
    private static String usuario = "root";
    private static String senha = "095118";

    public static Connection obtemConexao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // Carregar o driver MySQL
            String url = "jdbc:mysql://" + host + ":" + porta + "/" + db + "?useTimezone=true&serverTimezone=UTC";
            return DriverManager.getConnection(url, usuario, senha);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado");
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            System.out.println("Erro ao obter conexão");
            e.printStackTrace();
            return null;
        }
    }
}