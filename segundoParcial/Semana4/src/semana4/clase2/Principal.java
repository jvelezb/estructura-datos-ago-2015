/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana4.clase2;

/**
 *
 * @author juanvelezballesteros
 */
public class Principal {
    
    public static void main(String[] args){
        System.out.println("En la case Principal");
        Arreglo shalala = new Arreglo(10);
        Arreglo ar2 = new Arreglo(20);
        shalala.imprimir();
        ar2.imprimir();
        String str = shalala.obtenerString();
        System.out.println(str);
        double numero = ar2.obtenerDouble();
        System.out.println("El doble: "+numero);
        
    }
    
}
