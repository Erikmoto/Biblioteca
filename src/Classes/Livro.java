/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Date;

/**
 *
 * @author ryuic
 */
public class Livro {
    private int idLivro;
    private String nome;
    private short volume;
    private short edicao;
    private String autoria;
    private String editora;
    private short ano;
    private short quantidade;
    private int[] idsUsuariosLivro;
    private Date datasEmprestimos[];
    private short diasEntrega[];
    
    public Livro(int id, String nome, short vol, short ed, String aut, String edit, short ano, short quantidade) {
        this.idLivro = id;
        this.nome = nome;
        this.volume = vol;
        this.edicao = ed;
        this.autoria = aut;
        this.editora = edit;
        this.ano = ano;
        this.quantidade = quantidade;
        this.idsUsuariosLivro = new int[quantidade];
        this.datasEmprestimos = new Date[quantidade];
        this.diasEntrega = new short[quantidade];
    }
    
    private void adicionaComentario() {
        
    }
    
    private void removeComentario() {
        
    }
    
    private void verificaComentario() {
        
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public short getVolume() {
        return volume;
    }

    public void setVolume(short volume) {
        this.volume = volume;
    }

    public short getEdicao() {
        return edicao;
    }

    public void setEdicao(short edicao) {
        this.edicao = edicao;
    }

    public String getAutoria() {
        return autoria;
    }

    public void setAutoria(String autoria) {
        this.autoria = autoria;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public short getAno() {
        return ano;
    }

    public void setAno(short ano) {
        this.ano = ano;
    }

    public short getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(short quantidade) {
        this.quantidade = quantidade;
    }

    public int[] getIdsUsuariosLivro() {
        return idsUsuariosLivro;
    }

    public void setIdsUsuariosLivro(int[] idsUsuariosLivro) {
        this.idsUsuariosLivro = idsUsuariosLivro;
    }

    public Date[] getDatasEmprestimos() {
        return datasEmprestimos;
    }

    public void setDatasEmprestimos(Date[] datasEmprestimos) {
        this.datasEmprestimos = datasEmprestimos;
    }

    public short[] getDiasEntrega() {
        return diasEntrega;
    }

    public void setDiasEntrega(short[] diasEntrega) {
        this.diasEntrega = diasEntrega;
    }
}
