/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import DAO.LivroDAO;
import Interfaces.ConsultarAcervo;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author ryuic
 */
public class Acervo {
    private List<Livro> acervo;
    
    public Acervo() {
        
    }
    
    public void mostraAcervo(JFrame janelaAnterior) {
        ConsultarAcervo consAcervo = new ConsultarAcervo(janelaAnterior, this);
        consAcervo.setVisible(true);
    }
    
    public List<Livro> getAcervo() {
        LivroDAO livroDAO = new LivroDAO();
        acervo = livroDAO.listarTodos();
        
        return acervo;
    }
}
