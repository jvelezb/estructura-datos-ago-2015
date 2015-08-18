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
public class Fibonacci {
    
    public static void main(String[]args){
        int serie = 5;
        int resultado = obtenerFibonacci(serie);
        System.out.println("Resultado: "+ resultado);
    }
    
    public static int obtenerFibonacci(int numero){
        if(numero ==0 ||numero ==1){
            return 1;
        }else{
            System.out.println("Fibonacci("+(numero-2)+") + Fibonacci ("+(numero-1)+")");
            return obtenerFibonacci(numero-2)+obtenerFibonacci(numero-1);
        }
    }
    
    
}
