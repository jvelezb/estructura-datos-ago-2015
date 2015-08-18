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
import proyectos_semana2.ComunDivisor;
import proyectos_semana2.ComunDivisor;

/**
 *
 * @author juanvelezballesteros
 */
public class ComunDivisorTest {
    
    public ComunDivisorTest() {
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
     public void mcd5() {
         int numero1 = 10;
         int numero2 = 13;
         int resultado = ComunDivisor.sacarMcd(numero1,numero2);
         assertEquals(resultado, 1);
     
     }
}
