/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

import Usuarios.Usuario;
import java.util.ArrayList;
import javax.sql.DataSource;

/**
 *
 * @author Propietario
 */
public class ListaProductos {
    
    private DataSource dataSource;
    private ArrayList<Producto> productos;
    
    
    public ListaProductos(DataSource dataSource){
        this.dataSource = dataSource;
    }
    
}
