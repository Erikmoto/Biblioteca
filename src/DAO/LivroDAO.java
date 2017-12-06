/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classes.Livro;
import Conexao.ConexaoBancoDados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ryuic
 */
public class LivroDAO {
    
    private Connection conexao = null;
    private final double valorMultaDia = 0.5;
    
    public LivroDAO() {
        conexao = ConexaoBancoDados.getConnection();
    }
    
    public int encontraIDVazio() {
        String sql = "SELECT id FROM biblioteca.livro";
        int i = 0;
        
        PreparedStatement declaracao = null;
        ResultSet resultados = null;
        
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
            ConexaoBancoDados.closeConnection(conexao, declaracao);
        }
    }
    
    public Livro buscarLivroID(int ID) {
        String sql = "SELECT * FROM biblioteca.livro WHERE id = ?";
        
        PreparedStatement declaracao = null;
        ResultSet resultados = null;
        
        Livro livro = null;
        
        try {
            declaracao = conexao.prepareStatement(sql);
            
            declaracao.setInt(1, ID);
            
            resultados = declaracao.executeQuery();
            
            while(resultados.next()) {
                String[] dados = new String[8];
                
                for(int i = 0; i < dados.length; i++) {
                    dados[i] = resultados.getString(i+1);
                }
                
                livro = new Livro(Integer.parseInt(dados[0]), dados[1], Short.parseShort(dados[2]), Short.parseShort(dados[3]), dados[4], dados[5], Short.parseShort(dados[6]), Short.parseShort(dados[7]));
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            ConexaoBancoDados.closeConnection(conexao, declaracao, resultados);
        }
        
        return livro;
    }
    
    public List<Livro> buscarLivroNome(String nome) {
        String sql = "SELECT * FROM biblioteca.livro WHERE nome = ?";
        
        PreparedStatement declaracao = null;
        ResultSet resultados = null;
        
        List<Livro> livros = new ArrayList<>();
        
        try {
            declaracao = conexao.prepareStatement(sql);
            
            declaracao.setString(1, nome);
            
            resultados = declaracao.executeQuery();
            
            while(resultados.next()) {
                String[] dados = new String[8];
                
                for(int i = 0; i < dados.length; i++) {
                    dados[i] = resultados.getString(i+1);
                }
                
                Livro livro = new Livro(Integer.parseInt(dados[0]), dados[1], Short.parseShort(dados[2]), Short.parseShort(dados[3]), dados[4], dados[5], Short.parseShort(dados[6]), Short.parseShort(dados[7]));
                
                livros.add(livro);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            ConexaoBancoDados.closeConnection(conexao, declaracao, resultados);
        }
        
        return livros;
    }
    
    public List<Livro> buscarLivroAutoria(String autoria) {
        String sql = "SELECT * FROM biblioteca.livro WHERE autoria = ?";
        
        PreparedStatement declaracao = null;
        ResultSet resultados = null;
        
        List<Livro> livros = new ArrayList<>();
        
        try {
            declaracao = conexao.prepareStatement(sql);
            
            declaracao.setString(1, autoria);
            
            resultados = declaracao.executeQuery();
            
            while(resultados.next()) {
                String[] dados = new String[8];
                
                for(int i = 0; i < dados.length; i++) {
                    dados[i] = resultados.getString(i+1);
                }
                
                Livro livro = new Livro(Integer.parseInt(dados[0]), dados[1], Short.parseShort(dados[2]), Short.parseShort(dados[3]), dados[4], dados[5], Short.parseShort(dados[6]), Short.parseShort(dados[7]));
                
                livros.add(livro);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            ConexaoBancoDados.closeConnection(conexao, declaracao, resultados);
        }
        
        return livros;
    }
    
    public List<Livro> buscarLivroEditora(String editora) {
        String sql = "SELECT * FROM biblioteca.livro WHERE editora = ?";
        
        PreparedStatement declaracao = null;
        ResultSet resultados = null;
        
        List<Livro> livros = new ArrayList<>();
        
        try {
            declaracao = conexao.prepareStatement(sql);
            
            declaracao.setString(1, editora);
            
            resultados = declaracao.executeQuery();
            
            while(resultados.next()) {
                String[] dados = new String[8];
                
                for(int i = 0; i < dados.length; i++) {
                    dados[i] = resultados.getString(i+1);
                }
                
                Livro livro = new Livro(Integer.parseInt(dados[0]), dados[1], Short.parseShort(dados[2]), Short.parseShort(dados[3]), dados[4], dados[5], Short.parseShort(dados[6]), Short.parseShort(dados[7]));
                livros.add(livro);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            ConexaoBancoDados.closeConnection(conexao, declaracao, resultados);
        }
        
        return livros;
    }
    
    public List<Livro> listarTodos() {
        String sql = "SELECT * FROM biblioteca.livro";
        
        PreparedStatement declaracao = null;
        ResultSet resultados = null;
        
        List<Livro> acervo = new ArrayList<>();
        
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
            ConexaoBancoDados.closeConnection(conexao, declaracao, resultados);
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
            ConexaoBancoDados.closeConnection(conexao, declaracao);
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
            ConexaoBancoDados.closeConnection(conexao, declaracao);
        }
    }
    
    public boolean emprestar(int idUsuario, int idLivro) {
        String sql = "INSERT INTO biblioteca.emprestimo VALUES (?, ?, ?, ?)";
        
        PreparedStatement declaracao = null;
        
        GregorianCalendar data = (GregorianCalendar) GregorianCalendar.getInstance(Locale.getDefault());
        data.setTimeInMillis(System.currentTimeMillis());
        data.add(GregorianCalendar.DAY_OF_MONTH, 7);
        Date dataEntrega = data.getTime();
        DateFormat formataData = DateFormat.getDateInstance(1, Locale.getDefault());
        String dataFormatada = formataData.format(dataEntrega);
        
        try {
            declaracao = conexao.prepareStatement(sql);
            
            declaracao.setInt(1, idUsuario);
            declaracao.setInt(2, idLivro);
            declaracao.setString(3, dataFormatada);
            declaracao.setInt(4, 0);
            
            declaracao.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            
            return false;
        } finally {
            ConexaoBancoDados.closeConnection(conexao, declaracao);
        }
    }
    
    public short renovar(int idUsuario, int idLivro) {
        String sql = "UPDATE biblioteca.emprestimo SET (data_entrega, renovacoes) = (?, ?) WHERE (id_usuario = ? AND id_livro = ?)";
        Date novaDataEntrega;
        LivroDAO livroDAO = new LivroDAO();
        short renovacoes = livroDAO.verificarNumeroRenovacoes(idUsuario, idLivro);
        short MAX_RENOVACOES = 3;
        
        GregorianCalendar dataEntrega = (GregorianCalendar) GregorianCalendar.getInstance(Locale.getDefault());
        DateFormat formataData = DateFormat.getDateInstance(1, Locale.getDefault());
        String dataFormatada;
        
        if(renovacoes < MAX_RENOVACOES) {
            PreparedStatement declaracao = null;
            
            try {
                livroDAO = new LivroDAO();
                
                dataEntrega.add(GregorianCalendar.DAY_OF_MONTH, 7);
                dataEntrega.setTime(formataData.parse(livroDAO.verificarDataEntrega(idUsuario, idLivro)));
                novaDataEntrega = dataEntrega.getTime();
                dataFormatada = formataData.format(novaDataEntrega);
                
                declaracao = conexao.prepareStatement(sql);

                declaracao.setString(1, dataFormatada);
                declaracao.setInt(2, renovacoes + 1);
                declaracao.setInt(3, idUsuario);
                declaracao.setInt(4, idLivro);

                declaracao.executeUpdate();

                return 1;
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex);

                return -1;
            } catch (ParseException ex) {
                Logger.getLogger(LivroDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                ConexaoBancoDados.closeConnection(conexao, declaracao);
            }
        }
        
        else {
            System.out.println("Atingido o limite de renovações para este livro");
            return 0;
        }
        return 0;
    }
    
    public boolean devolver(int idUsuario, int idLivro) {
        String sql = "DELETE FROM biblioteca.emprestimo WHERE (id_usuario = ? AND id_livro = ?)";
        
        PreparedStatement declaracao = null;
        
        try {
            declaracao = conexao.prepareStatement(sql);
            
            declaracao.setInt(1, idUsuario);
            declaracao.setInt(2, idLivro);
            
            declaracao.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            
            return false;
        } finally {
            ConexaoBancoDados.closeConnection(conexao, declaracao);
        }
    }
    
    public short verificarNumeroRenovacoes(int idUsuario, int idLivro) {
        String sql = "SELECT renovacoes FROM biblioteca.emprestimo WHERE (id_usuario = ? AND id_livro = ?)";
        short renovacoes = 0;
        
        PreparedStatement declaracao = null;
        ResultSet resultados = null;
        
        try {
            declaracao = conexao.prepareStatement(sql);
            
            declaracao.setInt(1, idUsuario);
            declaracao.setInt(2, idLivro);
            
            resultados = declaracao.executeQuery();
            
            while(resultados.next()) {
                renovacoes = Short.parseShort(resultados.getString(1));
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            ConexaoBancoDados.closeConnection(conexao, declaracao, resultados);
        }
        
        return renovacoes;
    }
    
    public String verificarDataEntrega(int idUsuario, int idLivro) {
        String sql = "SELECT data_entrega FROM biblioteca.emprestimo WHERE (id_usuario = ? AND id_livro = ?)";
        
        String dataEntrega = null;
        
        PreparedStatement declaracao = null;
        ResultSet resultados = null;
        
        try {
            declaracao = conexao.prepareStatement(sql);
            
            declaracao.setInt(1, idUsuario);
            declaracao.setInt(2, idLivro);
            
            resultados = declaracao.executeQuery();
            
            while(resultados.next()) {
                dataEntrega = resultados.getString(1);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            ConexaoBancoDados.closeConnection(conexao, declaracao, resultados);
        }
        
        return dataEntrega;
    }
    
    public double consultarMulta(int idUsuario) {
        String sql = "SELECT data_entrega FROM biblioteca.emprestimo WHERE id_usuario = ?";
        
        GregorianCalendar dataEntrega = (GregorianCalendar) GregorianCalendar.getInstance(Locale.getDefault());
        GregorianCalendar dataAtual = (GregorianCalendar) GregorianCalendar.getInstance(Locale.getDefault());
        DateFormat formataData = DateFormat.getDateInstance(1, Locale.getDefault());
        int diasAtraso;
        double multa = 0;
        
        dataAtual.setTimeInMillis(System.currentTimeMillis());
        
        PreparedStatement declaracao = null;
        ResultSet resultados = null;
        
        try {
            declaracao = conexao.prepareStatement(sql);
            
            declaracao.setInt(1, idUsuario);
            
            resultados = declaracao.executeQuery();
            
            while(resultados.next()) {
                dataEntrega.setTime(formataData.parse(resultados.getString(1)));
                diasAtraso = dataAtual.get(GregorianCalendar.DAY_OF_YEAR) - dataEntrega.get(GregorianCalendar.DAY_OF_YEAR);
                
                if(diasAtraso > 0) {
                    multa += valorMultaDia * diasAtraso;
                }
            }
        } catch (SQLException | ParseException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            ConexaoBancoDados.closeConnection(conexao, declaracao, resultados);
        }
        
        return multa;
    }
    
    public List<Integer> consultarEmprestimo(int idUsuario) {
        String sql = "SELECT id_livro FROM biblioteca.emprestimo WHERE id_usuario = ?";
        List<Integer> idsLivros = new ArrayList<>();
        
        PreparedStatement declaracao = null;
        ResultSet resultados = null;
        
        try {
            declaracao = conexao.prepareStatement(sql);
            
            declaracao.setInt(1, idUsuario);
            
            resultados = declaracao.executeQuery();
            
            while(resultados.next()) {
                idsLivros.add(Integer.valueOf(resultados.getString(1)));
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            ConexaoBancoDados.closeConnection(conexao, declaracao, resultados);
        }
        
        return idsLivros;
    }
}
