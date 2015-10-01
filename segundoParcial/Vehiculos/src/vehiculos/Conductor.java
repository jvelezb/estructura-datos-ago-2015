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
public class Conductor {
    
    private Vehiculo vehiculo;

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public void conducir(){
        System.out.println("El conductor esta conduciendo");
        vehiculo.acelerar();
        vehiculo.direccion();
        vehiculo.frenar();
        vehiculo.velocidad();
    }
    
    
    
    
}
