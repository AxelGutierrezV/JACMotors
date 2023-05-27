/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.utp.jacmotors.model.cliente;

/**
 *
 * @author Axel
 */
public class Empresa extends Cliente{

    public Empresa(String Documento, String Nombre) {
        super(Documento, Nombre);
    }

    @Override
    public boolean validarIdentificacion() {
        if (Documento.length() != 12) {
            System.out.println("ingrese 12 digitos");
            return false;
        }
        return true;
    }

    @Override
    public boolean verificarDuplicado() {
        System.out.println("Verificando duplicado");
        return true;
    }

    }
