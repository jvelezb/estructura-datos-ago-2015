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
public class Inversor {
    
    
    public static int invertir (int n) // 4    3   1
    {
        System.out.println("invertir ("+n+")");
	if (n < 10)        
	    return n;
	else
	    return Integer.parseInt(""+(n % 10)+""+ invertir (n / 10) );
    }
    
}
