/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.testes.junit;

import br.edu.ifsul.jpa.EntityManagerUtil;
import br.edu.ifsul.modelo.Estado;
import br.edu.ifsul.modelo.Pais;
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
public class TestePersistirEstado {
     EntityManager em;
    public TestePersistirEstado() {
       
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
    public  void teste(){
    boolean exception =false;
    try{
    Estado e = new Estado();
    e.setNome("Bahia");
    e.setUf("BA");
    e.setPais(em.find(Pais.class, 8));
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        }catch (Exception e ){
        exception=true;
        e.printStackTrace();
        }
    Assert .assertEquals(false, exception);
    }   
}