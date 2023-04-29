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

    public Vehiculo(String marca, String modelo, String color, Double precio, String Fabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.Fabricacion = Fabricacion;
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
        return false;
    }

    @Override
    public String toString() {
        return ("marca: " + marca + "; modelo: " + modelo + " placa: " + placa);
    }
    
   

}
