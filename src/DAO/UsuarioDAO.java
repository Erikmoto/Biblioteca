/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classes.Usuario;
import Conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ryuic
 */
public class UsuarioDAO {
    
    private Connection conexao = null;
    
    public UsuarioDAO() {
        conexao = ConnectionFactory.getConnection();
    }
    
    public boolean salvar(Usuario usuario) {
        String sql = "INSERT INTO biblioteca.usuario VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement declaracao = null;
        
        try {
            declaracao = conexao.prepareStatement(sql);
            
            declaracao.setInt(1, usuario.getIdUsuario());
            declaracao.setString(2, usuario.getNome());
            declaracao.setString(3, usuario.getRG());
            declaracao.setString(4, usuario.getEndereco());
            declaracao.setString(5, usuario.getCEP());
            declaracao.setString(6, usuario.getCidade());
            declaracao.setString(7, usuario.getUF());
            declaracao.setString(8, usuario.getTelefone());
            declaracao.setString(9, usuario.getDataNascimento());
            declaracao.setString(10, usuario.getNomeUsuario());
            declaracao.setString(11, usuario.getSenha());
            declaracao.setString(12, usuario.getEmail());
            
            declaracao.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            
            return false;
        } finally {
            ConnectionFactory.closeConnection(conexao, declaracao);
        }
    }
    
    public List<Usuario> listarTodos() {
        PreparedStatement declaracao = null;
        ResultSet resultados = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        String sql = "SELECT * FROM biblioteca.usuario";
        
        try {
            declaracao = conexao.prepareStatement(sql);
            resultados = declaracao.executeQuery();
            
            while(resultados.next()) {
                String[] dados = new String[12];
                
                for(int i = 0; i < dados.length; i++) {
                    dados[i] = resultados.getString(i+1);
                }
                
                Usuario usuario = new Usuario(Integer.parseInt(dados[0]), dados[1], dados[2], dados[3], dados[4], dados[5], dados[6], dados[7], dados[8], dados[9], dados[10], dados[11]);
                
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(conexao, declaracao, resultados);
        }
        
        return usuarios;
    }
    
    public boolean atualizar(Usuario usuario) {
        String sql = "UPDATE biblioteca.usuario SET (nome, rg, endereco, cep, cidade, uf, telefone, data_de_nascimento) = (?, ?, ?, ?, ?, ?, ?, ?) WHERE id = ?";
        
        PreparedStatement declaracao = null;
        
        try {
            declaracao = conexao.prepareStatement(sql);
            
            declaracao.setString(1, usuario.getNome());
            declaracao.setString(2, usuario.getRG());
            declaracao.setString(3, usuario.getEndereco());
            declaracao.setString(4, usuario.getCEP());
            declaracao.setString(5, usuario.getCidade());
            declaracao.setString(6, usuario.getUF());
            declaracao.setString(7, usuario.getTelefone());
            declaracao.setString(8, usuario.getDataNascimento());
            declaracao.setInt(9, usuario.getIdUsuario());
            
            declaracao.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            
            return false;
        } finally {
            ConnectionFactory.closeConnection(conexao, declaracao);
        }
    }
    
    public boolean deletar(Usuario usuario) {
        String sql = "DELETE FROM biblioteca.usuario WHERE id = ?";
        
        PreparedStatement declaracao = null;
        
        try {
            declaracao = conexao.prepareStatement(sql);
            
            declaracao.setInt(1, usuario.getIdUsuario());
            
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
