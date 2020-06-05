/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

import java.util.Arrays;

/**
 *
 * @author Manuel
 */
public class Producto {
    
    public int cod;
    public String nombre;
    public double precio;
    public String rutaFotos;
    public int cantidad;
    
    public Producto(int cod,String nombre,double precio,String rutaFotos,int cantidad){        
        this.cod = cod;
        this.nombre = nombre;
        this.precio = precio;
        this.rutaFotos = rutaFotos;
        this.cantidad = cantidad;
    }
    
    public int getCod(){
        return cod;
    }
    public String getNombre(){
        return nombre;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public String getRutaFotos(){
        return rutaFotos;
    }
    
    public int getCantidad(){
        return cantidad;
    }

    
    
    
}
