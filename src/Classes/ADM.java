/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interfaces.CadastrarUsuario;
import Interfaces.ConsultarAcervo;
import Interfaces.EditarAcervo;
import Interfaces.EditarUsuario;

/**
 *
 * @author ryuic
 */
public class ADM {
    private int idAdmin;
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
    
    public ADM(int id, String nome, int CEP, String end, String cid, short UF, int RG, String nomeUs, String senha, String email, int tel) {
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
    }
    
    private void consultaAcervo() {
        ConsultarAcervo consAcervo = new ConsultarAcervo();
        consAcervo.setVisible(true);
    }
    
    private void editaUsuario() {
        EditarUsuario editUsuario = new EditarUsuario();
        editUsuario.setVisible(true);
    }
    
    private void editaAcervo() {
        EditarAcervo editAcervo = new EditarAcervo();
        editAcervo.setVisible(true);
    }
    
    private void cadastraUsuario() {
        CadastrarUsuario cadUsuario = new CadastrarUsuario();
        cadUsuario.setVisible(true);
    }
}
