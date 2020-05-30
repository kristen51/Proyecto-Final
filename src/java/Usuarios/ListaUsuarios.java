package Usuarios;

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
    
    private static final String NOMBRE_TABLA = "Usuario";
    
    Usuario[] usuarioss;
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

                        int codigo = resultSet.getInt("cod");
                        String nombreUsuario = resultSet.getString("nombreUsuario");
                        String email = resultSet.getString("email");
                        String nombreReal = resultSet.getString("nombreReal");
                        String apellidos = resultSet.getString("apellidos");
                        String contraseña = resultSet.getString("contraseña");
                        
                        usuarios.add(new Usuario(codigo,nombreUsuario,email,nombreReal,apellidos,contraseña));
                    }
                }
            }
        }
        return usuarios;
    }
    
    public void mete(Usuario usuario) throws SQLException {

        String sentenciaSQL = "INSERT INTO " + NOMBRE_TABLA + " VALUES("
                + usuario.getCodigo() + ", '"
                + usuario.getNombreUsuario()+ "', "
                + usuario.getEmail()+ "', "
                + usuario.getNombreReal()+ "', "
                + usuario.getApellidos()+ "', "
                + usuario.getKey()+ "', ";
                

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


