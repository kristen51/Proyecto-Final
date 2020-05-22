package Usuarios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
public class Usuario {
    
    public String nombreUsuario;
    public String email;
    public String nombre;
    public String apellidos;
    private String contraseña;
    public TipoUsuario tipo;
    
    public Usuario(String nombreUsuario, String email, String nombre,
            String apellidos,String contraseña){
        
        this.nombreUsuario= nombreUsuario;
        this.email = email;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.contraseña = contraseña;
    
    }
    
    
    public String getNombreCompleto(){
        return nombre+apellidos;    
    }
   
    public String getKey(){
    
        return contraseña;
    
    }
    
}
