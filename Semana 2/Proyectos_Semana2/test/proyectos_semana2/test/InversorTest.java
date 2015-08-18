/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos_semana2.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import proyectos_semana2.Inversor;

/**
 *
 * @author juanvelezballesteros
 */
public class InversorTest {
    
    public InversorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
     @Test
     public void hello() {
         int numero = 134;
         int resultado = Inversor.invertir(numero);
         assertEquals(431,resultado);
     
     
     }
     
     @Test
     public void invertir23(){
         int numero = 23;
         int resultado = Inversor.invertir(numero);
         assertEquals(32,resultado);
     }
}
