/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.jac_motors;

/**
 *
 * @author Axel
 */
public class Auto extends Vehiculo{
    
    @Override
    public String generarPlaca() {
        System.out.println("generando Placa de auto");
        return "placa de auto";
    }
    
}
