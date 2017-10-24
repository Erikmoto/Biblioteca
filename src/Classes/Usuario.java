/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interfaces.ConsultarAcervo;
import Interfaces.ConsultarDados;
import Interfaces.InterfaceUsuario;

/**
 *
 * @author ryuic
 */
public class Usuario {
    private int idUsuario;
    private String nome;
    private String CEP;
    private String endereco;
    private String cidade;
    private String UF;
    private String RG;
    private String nomeUsuario;
    private String senha;
    private String email;
    private String telefone;
    
    public Usuario(int id, String nome, String CEP, String end, String cid, String UF, String RG, String nomeUs, String senha, String email, String tel) {
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
    public void mostraInterface() {
        InterfaceUsuario intUsuario = new InterfaceUsuario(this);
        intUsuario.setVisible(true);
    }
    
    public void consultaAcervo(InterfaceUsuario intUsuario) {
        ConsultarAcervo consAcervo = new ConsultarAcervo(intUsuario);
        consAcervo.setVisible(true);
    }
    
    public void consultaDados() {
        ConsultarDados consDados = new ConsultarDados(this);
        consDados.setVisible(true);
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
