package Usuarios;

import Excepciones.IniciarSesionException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import javax.sql.DataSource;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
public class ListaUsuarios {
    
    private static final String NOMBRE_TABLA = "USUARIO";
    
    private DataSource dataSource;
    private ArrayList<Usuario> usuarios;
 
    
    public ListaUsuarios(DataSource dataSource){
        this.dataSource = dataSource;      
    }
     
    public ArrayList<Usuario> getUsuarios() throws SQLException{
    
        this.usuarios = new ArrayList<>();

        String sentenciaSQL = "select * from " + NOMBRE_TABLA;

        try (Connection connection = this.dataSource.getConnection()) {
            try (Statement statement = connection.createStatement()) {
                try (ResultSet resultSet = statement.executeQuery(sentenciaSQL)) {

                    while (resultSet.next()) {
                       
                        String nombreUsuario = resultSet.getString("nombreUsuario");
                        String email = resultSet.getString("email");
                        String nombreReal = resultSet.getString("nombreReal");
                        String apellidos = resultSet.getString("apellidos");
                        String contraseña = resultSet.getString("contraseña");
                        
                        usuarios.add(new Usuario(nombreUsuario,email,nombreReal,apellidos,contraseña));
                    }
                }
            }
        }
        return usuarios;
    }
    
    public String buscarUsuario(String identificador, String contraseña) throws SQLException, IniciarSesionException{
    
        
        String sentenciaSQL ="select nombreUsuario, email, contraseña from " + NOMBRE_TABLA +
                " where nombreUsuario='"+identificador+"' OR email='"+identificador+"' AND contraseña ="+contraseña;
        
        String nombreUsuario = null;
        String email = null;
        String password = null;
        
        try(Connection connection = this.dataSource.getConnection()){
            try(Statement statement = connection.createStatement()){
                try(ResultSet resultSet = statement.executeQuery(sentenciaSQL)){
                    
                    while(resultSet.next()){
                    
                    nombreUsuario = resultSet.getString("nombreUsuario");
                    email = resultSet.getString("email");
                    password = "1234";
                    }                 
                    if(nombreUsuario == null){
                        throw new IniciarSesionException("El nombre o correo electrónico no es correcto");           
                    }
                    else if(!password.equals(contraseña)){
                        throw new IniciarSesionException("La contraseña es incorrecta");                    
                    }
                    else{
                        return nombreUsuario;              
                    }
                }
            }
        }
    }
    public void mete(Usuario usuario) throws SQLException {

        String sentenciaSQL = "INSERT INTO " + NOMBRE_TABLA + " VALUES("
                + usuario.getCodigo() + ", '"
                + usuario.getNombreUsuario()+ "', '"
                + usuario.getEmail()+ "', "
                + usuario.getContraseña()+ ",'"
                + usuario.getNombreReal()+ "', '"
                + usuario.getApellidos()+ 
                "','normal')";

        try (Connection connection = this.dataSource.getConnection()) {
            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate(sentenciaSQL);
            }
        }
    }
    
    public String prueba(){
    
        return "adios";
    }
    
    
}


