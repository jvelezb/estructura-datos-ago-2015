/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana4;

/**
 *
 * @author juanvelezballesteros
 */
public class EjemploArreglo {
    
    public static void main(String[] arg){
         int [] arreglo; 
         int tamano = 10;
         arreglo = new int[tamano];
         
         double [] arreglo2 = new double[30];
         
         int [] arreglo3 = {1,2,3,4,3,2,1,3,3};
   
         int arreglo4[] = new int[10];
         
         System.out.println("El valor: arreglo3  pos2 :"+arreglo3[1] );
         System.out.println("El tamaño del arreglo3 es: "+ arreglo3.length);
         for (int i = 0; i<arreglo3.length;i++){
             System.out.print(" "+arreglo3[i]);
         }
         System.out.println("Siguiente");
         for (int item : arreglo3){
              System.out.print(" "+item);
         }
         System.out.println("Matrices: ");
         int[][] matriz  = new int [10][10];
         for (int i = 0; i<matriz.length; i++){
             for (int j= 0; j<matriz[i].length ; j++){
                 matriz[i][j]= i*j;
                 System.out.print(" "+matriz[i][j]);
             }
             System.out.println("");
         }
        
         
         
    }
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
}
