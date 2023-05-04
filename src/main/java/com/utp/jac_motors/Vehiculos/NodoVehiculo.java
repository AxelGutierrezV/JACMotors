/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.jac_motors.Vehiculos;

/**
 *
 * @author Axel
 */
public class NodoVehiculo {
    Vehiculo vehiculo;
    NodoVehiculo anterior;
    NodoVehiculo siguiente;

    public NodoVehiculo() {
    }

    public NodoVehiculo(Vehiculo vehiculoActual) {
        this.vehiculo = vehiculoActual;
        this.anterior = null;
        this.siguiente = null;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public NodoVehiculo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoVehiculo siguiente) {
        this.siguiente = siguiente;
    }  

    public NodoVehiculo getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoVehiculo anterior) {
        this.anterior = anterior;
    }
    
}
