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
public class Estudiante extends Persona{
    
    private String claveUlsa;

    public String getClaveUlsa() {
        return claveUlsa;
    }

    public void setClaveUlsa(String claveUlsa) {
        this.claveUlsa = claveUlsa;
    }

    
    
    public Estudiante(String nombre, int edad, String sexo){
        super(nombre,edad,sexo);
        System.out.println("En el constructor Estudiante");
    }
    
      public void estudiar(){
        System.out.println("Estudiar en Estudiante");
    }
      
    @Override
     public void comer(){
         //super.comer();
         System.out.println("Comer en Estudiante");
         
     }
     public void comer(String comida){
         System.out.println("Estoy comiendo: "+comida);
     }
     public void comerGarnachas(){
         System.out.println("Estoy comiendo: Garnachas");
         this.comer();
     }
        
        
    
    
}
    
    
    
    

