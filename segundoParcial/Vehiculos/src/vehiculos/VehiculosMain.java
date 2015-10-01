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
public class VehiculosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conductor juan = new Conductor();
        Vehiculo carro1 = new Van();
        juan.setVehiculo(carro1);
        juan.conducir();
        System.out.println("Juan Cambia de carro");
        Vehiculo carro2 = new Vocho();
        juan.setVehiculo(carro2);
        juan.conducir();
        System.out.println("Juan se saca la loteria");
        Vehiculo carro3 = new Ferrari();
        juan.setVehiculo(carro3);
        juan.conducir();
    }
    
}
