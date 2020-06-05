/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Opiniones;

/**
 *
 * @author Manuel
 */
public class Opinion {
    
    int cod;
    String descipcion;
    int puntuacion;
    int producto;
    int usuario;

public Opinion(String descripcion,int puntuacion,int producto,int usuario){

    this.descipcion = descripcion;
    this.puntuacion = puntuacion;
    this.usuario = usuario;
    this.producto = producto;

}
public String getDescripcion(){

    return descipcion;
}
public int getPuntuacion(){
    return puntuacion;
}
public int getUsuario(){
    return usuario;
}
public int getProducto(){
    return producto;
}



}