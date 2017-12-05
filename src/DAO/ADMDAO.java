/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classes.ADM;
import Conexao.ConexaoBancoDados;
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
public class ADMDAO {
    
    private Connection conexao = null;
    
    public ADMDAO() {
        conexao = ConexaoBancoDados.getConnection();
    }
    
    public int encontraIDVazio() {
        int i = 0;
        
        PreparedStatement declaracao = null;
        ResultSet resultados = null;
        
        String sql = "SELECT id FROM biblioteca.adm";
        
        try {
            declaracao = conexao.prepareStatement(sql);
            resultados = declaracao.executeQuery();
            
            while(resultados.next()) {
                if(i != Integer.parseInt(resultados.getString(1))) {
                    break;
                }
                
                i++;
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            ConexaoBancoDados.closeConnection(conexao, declaracao, resultados);
        }
        
        return i;
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
            ConexaoBancoDados.closeConnection(conexao, declaracao);
        }
    }
    
    public ADM procurarNomeUsuario(String nomeUsuario) {
        PreparedStatement declaracao = null;
        ResultSet resultados = null;
        
        ADM admin = null;
        
        String sql = "SELECT * FROM biblioteca.adm WHERE nome_usuario = ?";
        
        try {
            declaracao = conexao.prepareStatement(sql);
            
            declaracao.setString(1, nomeUsuario);
            
            resultados = declaracao.executeQuery();
            
            while(resultados.next()) {
                String[] dados = new String[12];
                
                for(int i = 0; i < dados.length; i++) {
                    dados[i] = resultados.getString(i+1);
                }

                admin = new ADM(Integer.parseInt(dados[0]), dados[1], dados[2], dados[3], dados[4], dados[5], dados[6], dados[7], dados[8], dados[9], dados[10], dados[11]);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            ConexaoBancoDados.closeConnection(conexao, declaracao, resultados);
        }
        
        return admin;
    }
    
    public List<ADM> listarTodos() {
        PreparedStatement declaracao = null;
        ResultSet resultados = null;
        
        List<ADM> administradores = new ArrayList<>();
        
        String sql = "SELECT * FROM biblioteca.adm";
        
        try {
            declaracao = conexao.prepareStatement(sql);
            resultados = declaracao.executeQuery();
            
            while(resultados.next()) {
                String[] dados = new String[12];
                
                for(int i = 0; i < dados.length; i++) {
                    dados[i] = resultados.getString(i+1);
                }
                
                ADM admin = new ADM(Integer.parseInt(dados[0]), dados[1], dados[2], dados[3], dados[4], dados[5], dados[6], dados[7], dados[8], dados[9], dados[10], dados[11]);
                
                administradores.add(admin);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            ConexaoBancoDados.closeConnection(conexao, declaracao, resultados);
        }
        
        return administradores;
    }
    
    public boolean atualizar(ADM admin) {
        String sql = "UPDATE biblioteca.adm SET (nome, rg, endereco, cep, cidade, uf, telefone, data_de_nascimento) = (?, ?, ?, ?, ?, ?, ?, ?) WHERE id = ?";
        
        PreparedStatement declaracao = null;
        
        try {
            declaracao = conexao.prepareStatement(sql);
            
            declaracao.setString(1, admin.getNome());
            declaracao.setString(2, admin.getRG());
            declaracao.setString(3, admin.getEndereco());
            declaracao.setString(4, admin.getCEP());
            declaracao.setString(5, admin.getCidade());
            declaracao.setString(6, admin.getUF());
            declaracao.setString(7, admin.getTelefone());
            declaracao.setString(8, admin.getDataNascimento());
            declaracao.setInt(9, admin.getIdAdmin());
            
            declaracao.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            
            return false;
        } finally {
            ConexaoBancoDados.closeConnection(conexao, declaracao);
        }
    }
    
    public boolean deletar(ADM admin) {
        String sql = "DELETE FROM biblioteca.adm WHERE id = ?";
        
        PreparedStatement declaracao = null;
        
        try {
            declaracao = conexao.prepareStatement(sql);
            
            declaracao.setInt(1, admin.getIdAdmin());
            
            declaracao.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            
            return false;
        } finally {
            ConexaoBancoDados.closeConnection(conexao, declaracao);
        }
    }
}
