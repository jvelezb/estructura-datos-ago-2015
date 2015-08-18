/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos_semana2;

/**
 *
 * @author juanvelezballesteros
 */
public class ComunDivisor {
    
    
    
    public static int sacarMcd(int a, int b) {
        System.out.println("sacarMcd(" +a+", " +b+" )");
        if(b==0)
            return a;
        else
            return sacarMcd(b, a % b);
    }
 
    
}
