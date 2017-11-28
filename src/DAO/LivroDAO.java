/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classes.Livro;
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
public class LivroDAO {
    
    private Connection conexao = null;
    
    public LivroDAO() {
        conexao = ConnectionFactory.getConnection();
    }
    
    public boolean salvar(Livro livro) {
        String sql = "INSERT INTO biblioteca.livro VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement declaracao = null;
        
        try {
            declaracao = conexao.prepareStatement(sql);
            
            declaracao.setInt(1, livro.getIdLivro());
            declaracao.setString(2, livro.getNome());
            declaracao.setInt(3, livro.getVolume());
            declaracao.setInt(4, livro.getEdicao());
            declaracao.setString(5, livro.getAutoria());
            declaracao.setString(6, livro.getEditora());
            declaracao.setInt(7, livro.getAno());
            declaracao.setInt(8, livro.getQuantidade());
            
            declaracao.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            
            return false;
        } finally {
            ConnectionFactory.closeConnection(conexao, declaracao);
        }
    }
    
    public List<Livro> listarTodos() {
        PreparedStatement declaracao = null;
        ResultSet resultados = null;
        
        List<Livro> acervo = new ArrayList<>();
        
        String sql = "SELECT * FROM biblioteca.livro";
        
        try {
            declaracao = conexao.prepareStatement(sql);
            resultados = declaracao.executeQuery();
            
            while(resultados.next()) {
                String[] dados = new String[8];
                
                for(int i = 0; i < dados.length; i++) {
                    dados[i] = resultados.getString(i+1);
                }
                
                Livro livro = new Livro(Integer.parseInt(dados[0]), dados[1], Short.parseShort(dados[2]), Short.parseShort(dados[3]), dados[4], dados[5], Short.parseShort(dados[6]), Short.parseShort(dados[7]));
                
                acervo.add(livro);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(conexao, declaracao, resultados);
        }
        
        return acervo;
    }
    
    public boolean atualizar(Livro livro) {
        String sql = "UPDATE biblioteca.livro SET (nome, volume, edicao, autoria, editora, ano, quantidade) = (?, ?, ?, ?, ?, ?, ?) WHERE id = ?";
        
        PreparedStatement declaracao = null;
        
        try {
            declaracao = conexao.prepareStatement(sql);
            
            declaracao.setString(1, livro.getNome());
            declaracao.setInt(2, livro.getVolume());
            declaracao.setInt(3, livro.getEdicao());
            declaracao.setString(4, livro.getAutoria());
            declaracao.setString(5, livro.getEditora());
            declaracao.setInt(6, livro.getAno());
            declaracao.setInt(7, livro.getQuantidade());
            declaracao.setInt(8, livro.getIdLivro());
            
            declaracao.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            
            return false;
        } finally {
            ConnectionFactory.closeConnection(conexao, declaracao);
        }
    }
    
    public boolean deletar(Livro livro) {
        String sql = "DELETE FROM biblioteca.livro WHERE id = ?";
        
        PreparedStatement declaracao = null;
        
        try {
            declaracao = conexao.prepareStatement(sql);
            
            declaracao.setInt(1, livro.getIdLivro());
            
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
