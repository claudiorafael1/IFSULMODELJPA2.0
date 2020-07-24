/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.testes;

import br.edu.ifsul.jpa.EntityManagerUtil;
import br.edu.ifsul.modelo.Pais;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author rafael
 */
public class TestePersostor {
    public static void main(String[] args){
  
   EntityManager em =EntityManagerUtil.getEntityMenager();
   Pais p = new Pais();
 
   p.setNome("Estados Unidos");
   p.setIso("EUA");
   em.getTransaction().begin();
   em.persist(p);
   em.getTransaction().commit();
   em.close();
   
   
    }
    
    
}
