/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author juanvelezballesteros
 */
public class Ejercicio6 {
    
    public int[] arr;
    
    public Ejercicio6 (int inicio){
        arr = new int[100];
        inicializar(inicio);
    } 
    
    private void inicializar(int inicio){
        for (int i = 0 ; i<arr.length;i++){
            arr[i] = inicio +i;
        }
    }
    
    
    public String[] imprimir(int inicio, int fin ){
        String [] resultado= new String[(fin -inicio)+1];
        for (int i = inicio; i<=fin;i++){
            String str = "";
            if(arr[i] % 3 ==0){
                str +="Fizz";
            } if(arr[i] % 5 ==0){
                str +="Buzz";
            }
            resultado[i-inicio] = str;
            System.out.println(arr[i]+": "+str);
        }
        return resultado;
    }
    
    public static void main(String []args){
        Ejercicio6 ej1 = new Ejercicio6(100);
        ej1.imprimir(50, 99);
    }
    
    public void repetir (){
        
    }
    
    
    
    
}
