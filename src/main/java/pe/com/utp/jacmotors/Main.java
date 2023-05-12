/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pe.com.utp.jacmotors;

import pe.com.utp.jacmotors.model.cliente.Cliente;
import pe.com.utp.jacmotors.model.cliente.PersonaNatural;
import pe.com.utp.jacmotors.model.vehiculo.Auto;
import pe.com.utp.jacmotors.model.vehiculo.Custer;
import pe.com.utp.jacmotors.model.vehiculo.Trailer;
import pe.com.utp.jacmotors.model.vehiculo.Vehiculo;
/**
 *
 * @author Axel
 */
public class Main {

    public static void main(String[] args) {
        Cliente cliente = new PersonaNatural("88888888", "Jhon Doe");
        int i= 0;
        while( i < 5){
            Vehiculo v = new Auto("renault", "logan", "verde", 20000.0, "2021");
            cliente.addVehiculo(v);
            Vehiculo c = new Custer("mitsubishi", "rosa", "azul", 40000.0, "2020");
            cliente.addVehiculo(c);
            Vehiculo t = new Trailer("Volvo", "FMX", "negro", 70000.0, "2019");
            cliente.addVehiculo(t);
            i++;
        }
        
        cliente.toString();
        System.out.println("\n---------\n");
        cliente.vehiculosOrdenados();
        cliente.toString();
                
    }
    }
