/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3.claseobjeto;

/**
 *
 * @author juanvelezballesteros
 */
public class Main {
    
    public static void main(String []args){
        
      Estudiante estudiante1 = new Estudiante("Juan ",20,"Masculino");
     // Persona persona1 = new Estudiante("Pedro",21,"Masculino");
     Persona juan = new Estudiante("juan",28,"M");
     juan.setNombre("Pedro");
     juan.setEdad(33);
     juan.setSexo("Machote");
     System.out.println("NOmbre: "+juan.getNombre());
     System.out.println("Edad: "+juan.getEdad());
     System.out.println("Sexo: "+juan.getSexo());  
     
     Universidad uni = new Universidad();
     uni.setNombre("ULSA");
     
      //juan.comerGarnachas();
      juan.comer();
      //estudiante1.comerGarnachas();
      
      
    }
    
    
    
    
    
    
    
    
}
