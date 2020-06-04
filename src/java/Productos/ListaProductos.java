/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

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
public class ListaProductos {
    
    private static final String NOMBRE_TABLA = "PRODUCTO";
    private DataSource dataSource;
    private ArrayList<Producto> productos;
    
    
    public ListaProductos(DataSource dataSource){
        this.dataSource = dataSource;
    }
    
   
    public ArrayList<Producto> getProductos() throws SQLException{
    
        this.productos = new ArrayList<>();

        String sentenciaSQL = "select * from " + NOMBRE_TABLA;

        try (Connection connection = this.dataSource.getConnection()) {
            try (Statement statement = connection.createStatement()) {
                try (ResultSet resultSet = statement.executeQuery(sentenciaSQL)) {

                    while (resultSet.next()) {
                        int cod = resultSet.getInt("cod");
                        String nombre = resultSet.getString("nombre");
                        double precio = resultSet.getDouble("precio");
                        String rutaFotos = resultSet.getString("rutaFotos");
                        int cantidad = resultSet.getInt("cantidad");
                        
                        productos.add(new Producto(cod,nombre,precio,rutaFotos,cantidad));
                    }
                }
            }
        }
        return productos;
    }
    
    
    
}
