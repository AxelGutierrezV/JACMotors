/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.utp.jacmotors.model.cliente;

import java.util.ArrayList;
import java.util.LinkedList;
import pe.com.utp.jacmotors.model.vehiculo.Vehiculo;

/**
 *
 * @author Axel
 */
public abstract class Cliente implements Identificacion{
    protected String Documento;
    private String Nombre;
    private LinkedList<Vehiculo> vehiculosAsociados;
    static ArrayList<Cliente> listaClientes = new ArrayList();

    public Cliente(String Documento, String Nombre) {
        this.Documento = Documento;
        this.Nombre = Nombre;
        this.vehiculosAsociados = vehiculosAsociados = new LinkedList();
    }
    
    public void addVehiculo(Vehiculo v){
        vehiculosAsociados.add(v);   
    }
    
    public void VehiculosAsociados(){
        for(Vehiculo v : vehiculosAsociados){
            System.out.println(v.getPlaca());
        }
    }
    
    public static ArrayList obtenerListaClientes(){
        return listaClientes;
    } 
    
    public static void addCliente(Cliente c){
        listaClientes.add(c);
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
    
    public static void añadirCliente(Cliente c){
        /*
        añade cliente a la arraylist
        */
    }

    @Override
    public String toString() {
        return "Cliente{" + "Documento=" + Documento + ", Nombre=" + Nombre + '}';
    }

}