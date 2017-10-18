/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interfaces.ConsultarAcervo;
import Interfaces.ConsultarDados;

/**
 *
 * @author ryuic
 */
public class Usuario {
    private int idUsuario;
    private String nome;
    private int CEP;
    private String endereco;
    private String cidade;
    private short UF;
    private int RG;
    private String nomeUsuario;
    private String senha;
    private String email;
    private int telefone;
    
    public Usuario(int id, String nome, int CEP, String end, String cid, short UF, int RG, String nomeUs, String senha, String email, int tel) {
        this.idUsuario = id;
        this.nome = nome;
        this.CEP = CEP;
        this.endereco = end;
        this.cidade = cid;
        this.UF = UF;
        this.RG = RG;
        this.nomeUsuario = nomeUs;
        this.senha = senha;
        this.email = email;
        this.telefone = tel;
    }
    
    private void consultaAcervo() {
        ConsultarAcervo consAcervo = new ConsultarAcervo();
        consAcervo.setVisible(true);
    }
    
    private void consultaDados() {
        ConsultarDados consDados = new ConsultarDados();
        consDados.setVisible(true);
    }
}
