/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

import java.util.Arrays;

/**
 *
 * @author Propietario
 */
public class Producto {
    
    public int cod;
    public String nombre;
    public double precio;
    public String rutaFotos;
    public Opinion[] opiniones;
    
    public Producto(int cod,String nombre,double precio,String rutaFotos,
            Opinion opiniones){        
        this.cod = cod;
        this.nombre = nombre;
        this.precio = precio;
        this.rutaFotos = rutaFotos;
        this.opiniones = new Opinion[0];
    
    }
    
    public void anyadeOpinion(Opinion newOpinion){
    
        opiniones = Arrays.copyOf(opiniones, opiniones.length+1);
        opiniones[opiniones.length-1] = newOpinion;
    
    }
    
    
    
}
