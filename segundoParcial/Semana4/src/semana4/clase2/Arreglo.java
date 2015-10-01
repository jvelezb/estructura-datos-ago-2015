/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana4.clase2;

import java.lang.Math;

/**
 *
 * @author juanvelezballesteros
 */
public class Arreglo {
    
    private int[] arreglo;
    
    public Arreglo (int tamano){
        arreglo = new int[tamano];
        this.inicializacion();
        
    }
    
    private void inicializacion(){
       
         for(int i = 0;i<=arreglo.length-1;i++){
            arreglo[i] = (int)(Math.random()*100);
        } 
    }
    
    public void imprimir(){
        for(int posicion = 0; posicion<arreglo.length;posicion++){
            System.out.println("arreglo["+posicion+"] = "+arreglo[posicion]);
        }
    }
    
    public void imprimir(int inicio, int fin){
        
    }
    
    public int obtenerMaximo(){
        int  maximo = 0;
        return maximo;
    }
    
    public long obtenerLong(){
        long numer = (long)0.0;
        return numer;
    }
    public double obtenerDouble(){
        double num = 0.0;
        return num;
    }
    public String obtenerString(){
        return "HOla";
    }
    
    
    
    
    public int[] ordenar(){
        
        
          
        for (int i = 0; i < this.arreglo.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < this.arreglo.length; j++)
                if (this.arreglo[j] < this.arreglo[index])
                    index = j;
      
            int smallerNumber = this.arreglo[index]; 
            this.arreglo[index] = this.arreglo[i];
            this.arreglo[i] = smallerNumber;
        }
        return this.arreglo;
    }
    
    
     
    public static void main(String[] args){
        System.out.println("En la clase arreglo");
        Arreglo ar1 = new Arreglo(10);
        Arreglo ar2 = new Arreglo(20);
        ar1.imprimir();
        ar2.imprimir();
    }
    
    
    
}
