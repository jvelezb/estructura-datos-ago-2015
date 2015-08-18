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
public class Proyectos_Semana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroDeEntrada = 3;
        int resultado = factorial(numeroDeEntrada);
        System.out.println("El resultado es: "+resultado);
    }
    
    public static int factorial (int numero){
        if(numero == 0){
            return 1;
        }else{
            return numero * factorial(numero -1);
        }
        
    }
            
            
    
}
