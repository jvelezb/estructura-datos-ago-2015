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
public abstract class Persona {
    private String nombre;
    private int edad;
    private String sexo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void comer(){
        System.out.println("Persona comiendo");
    }
    
    public void dormir(){
        System.out.println("Persona durmiendo");
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        System.out.println("En el constructor Persona con 3 parametros");
    }

  
    
    public Persona(){
        System.out.println("contructor de persona");
        this.nombre = "Sin nombre";
    }
    
  
    
   
    
    
    
    
            
    
    
    
    
}
