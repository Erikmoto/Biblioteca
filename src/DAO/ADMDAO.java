/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classes.ADM;
import Conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ryuic
 */
public class ADMDAO {
    
    private Connection conexao = null;
    
    public ADMDAO() {
        conexao = ConnectionFactory.getConnection();
    }
    
    public boolean salvar(ADM admin) {
        String sql = "INSERT INTO biblioteca.adm VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement declaracao = null;
        
        try {
            declaracao = conexao.prepareStatement(sql);
            
            declaracao.setInt(1, admin.getIdAdmin());
            declaracao.setString(2, admin.getNome());
            declaracao.setString(3, admin.getRG());
            declaracao.setString(4, admin.getEndereco());
            declaracao.setString(5, admin.getCEP());
            declaracao.setString(6, admin.getCidade());
            declaracao.setString(7, admin.getUF());
            declaracao.setString(8, admin.getTelefone());
            declaracao.setString(9, admin.getDataNascimento());
            declaracao.setString(10, admin.getNomeUsuario());
            declaracao.setString(11, admin.getSenha());
            declaracao.setString(12, admin.getEmail());
            
            declaracao.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            
            return false;
        } finally {
            ConnectionFactory.closeConnection(conexao, declaracao);
        }
    }
}
