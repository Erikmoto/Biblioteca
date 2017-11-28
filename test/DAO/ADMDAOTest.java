/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classes.ADM;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author ryuic
 */
public class ADMDAOTest {
    
    public ADMDAOTest() {
        
    }
    
    @Ignore
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
    
    @Ignore
    @Test
    public void listar() {
        ADMDAO adminDAO = new ADMDAO();
        
        for(ADM admin : adminDAO.listarTodos()) {
            System.out.println(
                "ID: " + admin.getIdAdmin() + "\n" +
                "Nome: " + admin.getNome() + "\n" +
                "RG: " + admin.getRG() + "\n" +
                "\n"
            );
        }
    }
    
    @Ignore
    @Test
    public void atualizar() {
        ADM admin = new ADM(0, "Administrador", "00.000.000-0", "Rua A", "00000-000", "Cidade A", "ACRE", "(00)00000-0000", "00/00/0000", "ADM", " ", "admin@laudebiblio.com");
        ADMDAO adminDAO = new ADMDAO();
        
        if(adminDAO.atualizar(admin)) {
            System.out.println("Admin atualizado com sucesso!");
        }
        
        else {
            fail("Erro ao atualizar admin");
        }
    }
    
    @Test
    public void deletar() {
        ADM admin = new ADM(0, "Administrador", "00.000.000-0", "Rua A", "00000-000", "Cidade A", "ACRE", "(00)00000-0000", "00/00/0000", "ADM", " ", "admin@laudebiblio.com");
        ADMDAO adminDAO = new ADMDAO();
        
        if(adminDAO.deletar(admin)) {
            System.out.println("Admin excluído com sucesso!");
        }
        
        else {
            fail("Erro ao excluir admin");
        }
    }
}
