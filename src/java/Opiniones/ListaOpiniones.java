/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Opiniones;

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
public class ListaOpiniones {
    
    private static final String NOMBRE_TABLA = "OPINION";
    
    private DataSource dataSource;
    private ArrayList<Opinion> opiniones;
 
    
    public ListaOpiniones(DataSource dataSource){
        this.dataSource = dataSource;      
    }
    
    public void mete(Opinion opinion) throws SQLException {

        String sentenciaSQL = "INSERT INTO " + NOMBRE_TABLA + " VALUES("
                + this.getNumOpiniones()+ ",'"
                + opinion.getDescripcion()+ "',"
                + opinion.getPuntuacion()+ ","
                + opinion.getProducto()+ ","
                + opinion.getUsuario()+ ")";


        try (Connection connection = this.dataSource.getConnection()) {
            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate(sentenciaSQL);
            }
        }
    }
    
    public ArrayList<Opinion> getOpiniones() throws SQLException{
    
        this.opiniones = new ArrayList<>();

        String sentenciaSQL = "select * from " + NOMBRE_TABLA;

        try (Connection connection = this.dataSource.getConnection()) {
            try (Statement statement = connection.createStatement()) {
                try (ResultSet resultSet = statement.executeQuery(sentenciaSQL)) {

                    while (resultSet.next()) {
                        int cod = resultSet.getInt("cod");
                        String descripcion = resultSet.getString("descripcion");
                        int puntuacion = resultSet.getInt("puntuacion");
                        int producto = resultSet.getInt("producto");
                        int usuario = resultSet.getInt("usuario");
                        
                        opiniones.add(new Opinion(descripcion,puntuacion,producto,usuario));
                    }
                }
            }
        }
        return opiniones;
    }
    
    public int getNumOpiniones() throws SQLException{
        
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
