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
    
    
    public int cod;
    public String nombreUsuario;
    public String email;
    public String nombre;
    public String apellidos;
    private String contraseña;
    public TipoUsuario tipo;
    
    private static int codigoNuevoUsuario = 5;
    
    public static final String PATRON_NOMBRE_USUARIO= "\\w{4,8}";
    public static final String PATRON_EMAIL= "\\w{2,}.@\\w{2,}.\\w{2,}";
    public static final String PATRON_CONTRASEÑA = "\\d{4}";
    
    
    public Usuario(String nombreUsuario, String email, String nombre,
            String apellidos,String contraseña){
        
        this.cod = codigoNuevoUsuario;
        codigoNuevoUsuario++;
        this.nombreUsuario= nombreUsuario;
        this.email = email;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.contraseña = contraseña;   
    }
    
    public String datosUsuario(){
    
        return nombreUsuario + " " +email + nombre + apellidos + cod;        
    }
    
    public String getNombreCompleto(){
        return nombre+apellidos;    
    }
   
    public String getContraseña(){
    
        return contraseña;  
    }

    public int getCodigo() {
        return cod;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getEmail() {
        return email;
    }
    
    public String getNombreReal() {
        return nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public String prueba(){
    
        return "adios";
    }
  
}
