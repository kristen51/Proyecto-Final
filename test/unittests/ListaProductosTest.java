/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittests;

import Formularios.ListaFormularios;
import Productos.ListaProductos;
import Productos.Producto;
import Usuarios.ListaUsuarios;
import java.sql.SQLException;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Propietario
 */
public class ListaProductosTest extends UnitTest {
    
    private final ListaProductos listaProductos;
    
    public ListaProductosTest(){
        super();     
        this.listaProductos = new ListaProductos(this.dataSource);
        
    }
    
    
    @Test
    public void testGetProductos() throws SQLException{
        
        Producto producto1 = new Producto(0, "producto1", 10, ".", 2);
        Producto producto2 = new Producto(1, "producto2", 15, ".", 2);
        Producto producto3 = new Producto(2, "producto3", 10, ".", 2);
        
        listaProductos.mete(producto1);
        listaProductos.mete(producto2);
        listaProductos.mete(producto3);
        
        ArrayList<Producto> productos = new ArrayList<>();
        
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
          
        Assert.assertEquals(productos.get(0).getNombre(), listaProductos.getProductos().get(0).getNombre());
        Assert.assertEquals(productos.get(1).getNombre(), listaProductos.getProductos().get(1).getNombre());
        Assert.assertEquals(productos.get(2).getNombre(), listaProductos.getProductos().get(2).getNombre());
        
    
    }
 
}
