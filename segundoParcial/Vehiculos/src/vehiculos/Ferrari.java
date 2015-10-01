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
public class Ferrari implements Vehiculo{
    @Override
    public void direccion(){
        System.out.println("Ferrari construye su volante");
    }
    
    @Override
    public String frenar(){
        System.out.println("Ferrari"
                + " implementa "
                + "sus frenos de alta "
                + "potencia");
        return "Frenando Ferrari";
    } 
    @Override
    public String acelerar(){
        System.out.println("Ferrari va a acelerar con su motor"
                + "V 12");
        return "Ferrari Acelerado de 0 a 100";
    }
    
    @Override
    public int velocidad(){
        System.out.println("Ferrari con palanca"
                + " de velocidades");
        return 1;
    }
}
