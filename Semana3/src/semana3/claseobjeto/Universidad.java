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
public class Universidad implements SistemaCalificacion {
    private String nombre;
    public String carrera;

    public Universidad(){
        System.out.println("Se esta creado el objeto Universidad");
    }
    public Universidad(String nombre){
        this.nombre = nombre;
    }
    
    
    public String getNombre() {
        return "Universidad: "+ nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void calificarSistema(){
        System.out.println("En universidad- sistema de calificacion");
    }
    
    
    
}
