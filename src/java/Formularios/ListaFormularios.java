/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Usuarios.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.sql.DataSource;

/**
 *
 * @author Propietario
 */
public class ListaFormularios {
    
    private static final String NOMBRE_TABLA = "FORMULARIO";
    
    private DataSource dataSource;
    private ArrayList<Usuario> formularios;
    
    public ListaFormularios(DataSource dataSource){
        this.dataSource = dataSource;
    
    }
    
    public void mete(Formulario formulario) throws SQLException {

        String sentenciaSQL = "INSERT INTO " + NOMBRE_TABLA + " VALUES("
                + getNumUsuarios() + ", '"
                + formulario.getNombreReal()+ "', '"
                + formulario.getApellidos()+"', '"
                + formulario.getEmail()+ "',"
                + formulario.getTelefono()+",'"
                + formulario.getComentario()+"',"
                + formulario.getUsuario()+")";
        
        try (Connection connection = this.dataSource.getConnection()) {
            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate(sentenciaSQL);
            }
        }
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

}
