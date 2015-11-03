/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author juanvelezballesteros
 */
public class Vocho implements Vehiculo{
    
      @Override
      public void direccion(){
        System.out.println("Vocho construye su volante");
    }
    
      @Override
    public String frenar(){
        System.out.println("Vocho"
                + " implementa "
                + "sus frenos de baja velocidad");
        return "Frenando Vocho ";
    } 
      @Override
    public String acelerar(){
        System.out.println("Vocho acelerando muuuuy lento");
        return "Vocho tratando de Acelerar";
    }
    
      @Override
    public int velocidad(){
        System.out.println("V0cho  con palanca de 4 velocidades");
        return 100;
    }
    
}
