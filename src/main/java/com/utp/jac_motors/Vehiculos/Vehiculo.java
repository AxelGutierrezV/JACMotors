package com.utp.jac_motors.Vehiculos;

import java.util.Random;

/**
 *
 * @author Axel
 */
public abstract class Vehiculo implements Placa {
    String marca;
    String modelo;
    String color;
    Double precio;
    String Fabricacion;
    String placa;
    Random r = new Random();

    public Vehiculo() {
        this.placa = generarPlaca();
    }

    public String getPlaca() {
        return placa;
    }
    
    @Override
    public boolean validarPlacaDuplicada(String placa) {
        /*
        Verifica la placa generada con la base de datos, si la encuentra significa que esta duplicada
        y retorna true; En caso no la encuentre, retorna false
        */
        System.out.println("validando placa");
        return false;
    }
}
