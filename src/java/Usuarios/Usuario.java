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
    
    
    private int cod;
    private String nombreUsuario;
    private String email;
    private String nombre;
    private String apellidos;
    private String contraseña;
    private String tipo;
    
    public static final String PATRON_NOMBRE_USUARIO= "\\w{4,8}";
    public static final String PATRON_EMAIL= "\\w{2,}.@\\w{2,}.\\w{2,}";
    public static final String PATRON_CONTRASEÑA = "\\d{4}";
    
    
    public Usuario(int cod,String nombreUsuario, String email, String nombre,
            String apellidos,String contraseña){
        
        this.cod = cod;
        this.nombreUsuario= nombreUsuario;
        this.email = email;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.contraseña = contraseña;   
    }
    
    public Usuario(Usuario usuario){
        
        this.cod = usuario.getCodigo();
        this.nombreUsuario = usuario.getNombreUsuario();
        this.email = usuario.getEmail();
        this.nombre = usuario.getNombreReal();
        this.apellidos = usuario.getApellidos();
        this.contraseña = usuario.getContraseña();
    
    }

    public String datosUsuario(){
    
        return nombreUsuario + " " +email +" "+ nombre +" "+ apellidos;        
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

  
}
