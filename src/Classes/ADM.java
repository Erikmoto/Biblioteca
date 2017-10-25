/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interfaces.CadastrarUsuario;
import Interfaces.EditarAcervo;
import Interfaces.EditarUsuario;
import Interfaces.InterfaceAdm;

/**
 *
 * @author ryuic
 */
public class ADM {
    private int idAdmin;
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
    private InterfaceAdm intAdm;
    
    public ADM(int id, String nome, String CEP, String end, String cid, String UF, String RG, String nomeUs, String senha, String email, String tel) {
        this.idAdmin = id;
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
        this.intAdm = new InterfaceAdm(this);
    }
    
    public void mostraInterface() {
        this.intAdm.setVisible(true);
    }
    
    public void consultaAcervo() {
        Acervo acervo = new Acervo();
        acervo.mostraAcervo(this.intAdm);
    }
    
    public void editaUsuario() {
        EditarUsuario editUsuario = new EditarUsuario(this);
        editUsuario.setVisible(true);
    }
    
    public void editaAcervo() {
        EditarAcervo editAcervo = new EditarAcervo(this);
        editAcervo.setVisible(true);
    }
    
    public void cadastraUsuario() {
        CadastrarUsuario cadUsuario = new CadastrarUsuario(this);
        cadUsuario.setVisible(true);
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
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
