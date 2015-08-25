/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3.claseobjeto;
import java.lang.Math;

/**
 *
 * @author juanvelezballesteros
 */
public class Profesor  extends Persona{
    
    private String especialidad;

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public void ensenar(){
        System.out.println("Enseñar en Profesor");
    }
    
    public int darCalificacion(){
        return (int)(Math.random()*10);
    }
    
    
    
}
