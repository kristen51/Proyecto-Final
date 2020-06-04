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
    
    public int getNumUsuarios() throws SQLException{
        
        String sentenciaSQL = "select * from " + NOMBRE_TABLA;
        int i = 0;
        try (Connection connection = this.dataSource.getConnection()) {
            try (Statement statement = connection.createStatement()) {
                try (ResultSet resultSet = statement.executeQuery(sentenciaSQL)) {
                    while (resultSet.next()) {
                       i++;                                                                  
                    }
                }
            }
        }
        return i;
    }   
     
    public ArrayList<Usuario> getUsuarios() throws SQLException{
    
        this.usuarios = new ArrayList<>();

        String sentenciaSQL = "select * from " + NOMBRE_TABLA;

        try (Connection connection = this.dataSource.getConnection()) {
            try (Statement statement = connection.createStatement()) {
                try (ResultSet resultSet = statement.executeQuery(sentenciaSQL)) {

                    while (resultSet.next()) {
                        int cod = resultSet.getInt("cod");
                        String nombreUsuario = resultSet.getString("nombreUsuario");
                        String email = resultSet.getString("email");
                        String nombreReal = resultSet.getString("nombreReal");
                        String apellidos = resultSet.getString("apellidos");
                        String contraseña = resultSet.getString("contraseña");
                        
                        usuarios.add(new Usuario(cod,nombreUsuario,email,nombreReal,apellidos,contraseña));
                    }
                }
            }
        }
        return usuarios;
    }
    
    public Usuario getUsuario(int cod) throws SQLException{
    
        String sentenciaSQL = "select * from " + NOMBRE_TABLA + " where cod=" + cod;
        
        try (Connection connection = this.dataSource.getConnection()) {
            try (Statement statement = connection.createStatement()) {
                try (ResultSet resultSet = statement.executeQuery(sentenciaSQL)) {

                    while (resultSet.next()) {    
                       
                        String nombreUsuario = resultSet.getString("nombreUsuario");
                        String email = resultSet.getString("email");
                        String nombreReal = resultSet.getString("nombreReal");
                        String apellidos = resultSet.getString("apellidos");
                        String contraseña = resultSet.getString("contraseña");                        
                        return new Usuario(cod,nombreUsuario,email,nombreReal,apellidos,contraseña);
                    }
                }
            }
        }
        return null; 
    }
    
    public String buscarUsuario(String identificador) throws SQLException{
    
        
        String sentenciaSQL ="select nombreUsuario, email, contraseña from " + NOMBRE_TABLA +
                " where nombreUsuario='"+identificador+"' OR email='"+identificador+"'";
        
        String nombreUsuarioEncontrado = null;
        String emailEncontrado = null;
        String passwordEncontrado = null;
        
        try(Connection connection = this.dataSource.getConnection()){
            try(Statement statement = connection.createStatement()){
                try(ResultSet resultSet = statement.executeQuery(sentenciaSQL)){
                    
                    while(resultSet.next()){
                    
                    nombreUsuarioEncontrado = resultSet.getString("nombreUsuario");
                    emailEncontrado = resultSet.getString("email");
                    passwordEncontrado = resultSet.getString("contraseña");
                    }
                    
                    if(nombreUsuarioEncontrado == null){
                        return null;                   
                    }
                    else{                                      
                    return passwordEncontrado;   
                    }
                }
            }
        }
    }
    
    public String getNombreUsuarioSegunIdentificador(String identificador) throws SQLException{
    
        String sentenciaSQL ="select nombreUsuario, email, contraseña from " + NOMBRE_TABLA +
                " where nombreUsuario='"+identificador+"' OR email='"+identificador+"'";
        String nombreUsuarioEncontrado = null;
        
        try(Connection connection = this.dataSource.getConnection()){
            try(Statement statement = connection.createStatement()){
                try(ResultSet resultSet = statement.executeQuery(sentenciaSQL)){
                    while(resultSet.next()){
                    
                    nombreUsuarioEncontrado = resultSet.getString("nombreUsuario");
                    }
                    return nombreUsuarioEncontrado;                    
                }            
            }
        }
    }
    
    public int getCodSegunIdentificador(String identificador) throws SQLException{
    
        String sentenciaSQL ="select nombreUsuario, email, contraseña from " + NOMBRE_TABLA +
                " where nombreUsuario='"+identificador+"' OR email='"+identificador+"'";
        int cod= 0;
        
        try(Connection connection = this.dataSource.getConnection()){
            try(Statement statement = connection.createStatement()){
                try(ResultSet resultSet = statement.executeQuery(sentenciaSQL)){
                    while(resultSet.next()){                   
                    cod =Integer.parseInt(resultSet.getString("cod"));   
                    }
                    return cod;                    
                }            
            }
        }
    }
    
    public String[] getNombreCompletoSegunIdentificador(String identificador) throws SQLException{
    
        String sentenciaSQL ="select nombreReal,apellidos from " + NOMBRE_TABLA +
                " where nombreUsuario='"+identificador+"' OR email='"+identificador+"'";
        String[] nombreCompleto = new String[2];
        
        try(Connection connection = this.dataSource.getConnection()){
            try(Statement statement = connection.createStatement()){
                try(ResultSet resultSet = statement.executeQuery(sentenciaSQL)){
                    while(resultSet.next()){           
                        
                    nombreCompleto[0] = resultSet.getString("nombreReal");
                    nombreCompleto[1] = resultSet.getString("apellidos");
                    }
                    return nombreCompleto;                    
                }            
            }
        }
    }
        
    public void mete(Usuario usuario,int numUsuarios) throws SQLException {

        String sentenciaSQL = "INSERT INTO " + NOMBRE_TABLA + " VALUES("
                + numUsuarios + ", '"
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
    
    public void update(Usuario usuario) throws SQLException{
    
        String sentenciaSQL ="UPDATE "+ NOMBRE_TABLA +
                " SET nombreUsuario ='"+ usuario.getNombreUsuario()
                +"', email ='"+ usuario.getEmail()
                +"', contraseña ='"+ usuario.getContraseña()
                +"', nombreReal ='"+ usuario.getNombreReal()
                +"', apellidos ='"+ usuario.getApellidos()
                +"' WHERE cod ="+usuario.getCodigo();
                
        try (Connection connection = this.dataSource.getConnection()) {
            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate(sentenciaSQL);
            }
        }
    }
      }
    



