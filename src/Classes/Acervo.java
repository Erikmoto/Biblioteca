/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interfaces.ConsultarAcervo;
import javax.swing.JFrame;

/**
 *
 * @author ryuic
 */
public class Acervo {
    public Acervo() {
        
    }
    
    public void mostraAcervo(JFrame janelaAnterior) {
        ConsultarAcervo consAcervo = new ConsultarAcervo(janelaAnterior);
        consAcervo.setVisible(true);
    }
}
