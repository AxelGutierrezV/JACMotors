/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.utp.jac_motors;

import com.utp.jac_motors.Vehiculos.*;
import com.utp.jac_motors.Clients.*;
/**
 *
 * @author Axel
 */
public class JAC_Motors {

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
