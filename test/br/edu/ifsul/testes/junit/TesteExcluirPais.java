/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.testes.junit;

import br.edu.ifsul.jpa.EntityManagerUtil;
import br.edu.ifsul.modelo.Pais;
import javax.persistence.Column;
import javax.persistence.EntityManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rafael
 */
public class TesteExcluirPais {
     EntityManager em;
    
    public TesteExcluirPais() {
    }
    
    @Before
    public void setUp() {
          em=EntityManagerUtil.getEntityMenager();
    }
    
    @After
    public void tearDown() {
    em.close();
    
    }
  
    
    @Test
      public void teste(){
   

    boolean exception =false;
    try{
  
        /* Pais p = em.find(Pais.class,8);
         p.setNome("Argentina");
         p.setIso("ARG");  
        em.getTransaction().begin();
         em.merge(p);
        em.getTransaction().commit();*/
        
     Pais p = em.find(Pais.class,8);
       em.getTransaction().begin();
       em.remove(p);
       em.getTransaction().commit();
        }catch (Exception e ){
        exception=true;
        e.printStackTrace();
        }
    Assert .assertEquals(false, exception);
    }
    
    
}
