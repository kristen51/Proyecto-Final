/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Usuarios.Usuario;

/**
 *
 * @author Propietario
 */
public class Formulario {
    
    String nombreReal;
    String apellidos;
    String email;
    String telefono;
    String comentario;
    int usuario;
    
    
    public static final String PATRON_TELEFONO = "\\d{9}";
    public static final String PATRON_EMAIL= "\\w{2,}.@\\w{2,}.\\w{2,}";
    
    public Formulario(String nombreReal,String apellidos,String email,
            String telefono,String comentario,int usuario){
        
        this.nombreReal = nombreReal;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.comentario = comentario;
        this.usuario = usuario;
    }


    public String getEmail() {
        return email;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getComentario() {
       return comentario;
    }

    public int getUsuario() {
        return usuario;
    }
    
}
