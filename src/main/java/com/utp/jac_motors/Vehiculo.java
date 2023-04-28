package com.utp.jac_motors;

/**
 *
 * @author Axel
 */
public abstract class Vehiculo implements Placa {
    String placa;

    public Vehiculo() {
        this.placa = generarPlaca();
    }
    
    
}
