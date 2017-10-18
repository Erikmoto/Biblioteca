/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

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
    
    public Livro(int id, String nome, short vol, short ed, String aut, String edit, short ano) {
        this.idLivro = id;
        this.nome = nome;
        this.volume = vol;
        this.edicao = ed;
        this.autoria = aut;
        this.editora = edit;
        this.ano = ano;
    }
    
    private void adicionaComentario() {
        
    }
    
    private void removeComentario() {
        
    }
    
    private void verificaComentario() {
        
    }
}
