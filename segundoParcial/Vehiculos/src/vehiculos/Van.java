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
public class Van implements Vehiculo{

     @Override
     public void direccion(){
        System.out.println("Van con su volante de peluche");
    }
    
     @Override
    public String frenar(){
        System.out.println("Van"
                + " esta frenando como camion");
        return "Frenando con ruidos";
    } 
     @Override
    public String acelerar(){
        System.out.println("Van va muy ruidoso");
        return "Van  acelerando lento";
    }
    
     @Override
    public int velocidad(){
        System.out.println("Velocidad con palanca"
                + " alacran");
        return 123;
    }
    
}
