/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ryuic
 */
public class ConnectionFactory {
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/BDLaudeBiblio";
    private static final String USER = "postgres";
    private static final String PASS = " ";
    
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão", ex);
        }
    }
    
    public static void closeConnection(Connection conexao) {
        if(conexao != null) {
            try {
                conexao.close();
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex.getMessage());
            }
        }
    }
    
    public static void closeConnection(Connection conexao, PreparedStatement declaracao) {
        if(declaracao != null) {
            try {
                declaracao.close();
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex.getMessage());
            }
        }
        
        closeConnection(conexao);
    }
    
    public static void closeConnection(Connection conexao, PreparedStatement declaracao, ResultSet resultados) {
        if(resultados != null) {
            try {
                resultados.close();
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex.getMessage());
            }
        }
        
        closeConnection(conexao, declaracao);
    }
}