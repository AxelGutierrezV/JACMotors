/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.utp.jacmotors.model.vehiculo;

/**
 *
 * @author Axel
 */
public class Custer extends Vehiculo{

    public Custer(String marca, String modelo, String color, Double precio, String Fabricacion) {
        super(marca, modelo, color, precio, Fabricacion);
    }

    public String generarPlaca() {
        String placa="";
        for (int i = 0; i < 5; i++) {
         String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
         char c = letras.charAt(r.nextInt(letras.length()));
         String a = String.valueOf(c);
         placa = placa.concat(a);
        }
        placa+="C";
        if (validarPlacaDuplicada(placa)) {
            generarPlaca();            
        }
        return placa;
    }
}
