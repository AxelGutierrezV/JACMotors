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
    ArrayList<Vehiculo> vehiculosAsociados;

    public Cliente(String Documento, String Nombre) {
        this.Documento = Documento;
        this.Nombre = Nombre;
        this.vehiculosAsociados = vehiculosAsociados = new ArrayList();
    }
    
    public void addVehiculo(Vehiculo v){
        vehiculosAsociados.add(v);   
    }
    
    public void VehiculosAsociados(){
        for(Vehiculo v : vehiculosAsociados){
            System.out.println(v.getPlaca());
        }
    }
    
    public void vehiculosOrdenados(){
        for (Vehiculo v : vehiculosAsociados) {
            for (int j = 0; j < vehiculosAsociados.size()-1; j++) {
                if ((vehiculosAsociados.get(j).getPlaca().compareTo(vehiculosAsociados.get(j+1).getPlaca())>0)) {
                    Vehiculo vaux = vehiculosAsociados.get(j);
                    vehiculosAsociados.set(j,vehiculosAsociados.get(j+1));
                    vehiculosAsociados.set(j+1, vaux);
                }
            }
        }
    }

    @Override
    public String toString() {
        for(Vehiculo v : vehiculosAsociados){
            System.out.println(v.toString());
    }
        return "";
    
}
}