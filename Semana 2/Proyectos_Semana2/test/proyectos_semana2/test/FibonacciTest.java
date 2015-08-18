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
import proyectos_semana2.Fibonacci;
import static org.junit.Assert.*;

/**
 *
 * @author juanvelezballesteros
 */
public class FibonacciTest {
    
    public FibonacciTest() {
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
     public void prueba5() {
        int numero = 4;
        int resultado =Fibonacci.obtenerFibonacci(numero);
        assertEquals(resultado,6);
     
     }
     @Test
     public void prueba0(){
          int numero = 0;
        int resultado =Fibonacci.obtenerFibonacci(numero);
        assertEquals(resultado,2);
     }
     
}
