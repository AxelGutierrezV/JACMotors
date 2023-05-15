/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.utp.jacmotors.model.cliente;

/**
 *
 * @author Axel
 */
public class PersonaNatural extends Cliente{

    public PersonaNatural(String Documento, String Nombre) {
        super(Documento, Nombre);
    }

    @Override
    public boolean validarIdentificacion() {
        if (Documento.length() != 8) {
            System.out.println("ingrese 8 digitos");
            return false;
        }
        return true;
    }

    @Override
    public boolean verificarDuplicado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}