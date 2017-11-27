/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classes.ADM;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ryuic
 */
public class ADMDAOTest {
    
    public ADMDAOTest() {
    }

    @Test
    public void inserir() {
        ADM admin = new ADM(0, "Admin", "00.000.000-0", "Rua A", "00000-000", "Cidade A", "ACRE", "(00)00000-0000", "00/00/0000", "ADM", " ", "admin@laudebiblio.com");
        ADMDAO adminDAO = new ADMDAO();
        
        if(adminDAO.salvar(admin)) {
            System.out.println("Admin salvo com sucesso!");
        }
        
        else {
            fail("Erro ao salvar admin");
        }
    }
    
}
