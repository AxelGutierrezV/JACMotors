/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.jac_motors.Clients;

import com.utp.jac_motors.Vehiculos.Vehiculo;
import java.util.ArrayList;

/**
 *
 * @author Axel
 */
public abstract class Cliente implements Identificacion{
    String Documento;
    String Nombre;
    ArrayList<Vehiculo> VehiculosAsociados;

    public Cliente(String Documento, String Nombre) {
        this.Documento = Documento;
        this.Nombre = Nombre;
        this.VehiculosAsociados = VehiculosAsociados = new ArrayList();
    }
    
    public void AñadirVehiculo(Vehiculo v){
        VehiculosAsociados.add(v);
        
    }
}
