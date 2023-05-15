/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.utp.jacmotors.model.vehiculo;

/**
 *
 * @author Axel
 */
public interface Placa {

    String generarPlaca();
    
    boolean validarPlacaDuplicada(String placa);
    
}
