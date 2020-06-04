/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittests.main.taller.clientes;



import java.sql.SQLException;
import main.taller.clientes.Cliente;
import main.taller.clientes.ListaClientes;
import main.taller.clientes.TipoCliente;
import main.taller.excepciones.NoExisteException;
import org.junit.Test;
import static org.junit.Assert.*;
import unittests.UnitTest;


/**
 *
 * @author Rober
 */
public class ListaClientesTest extends UnitTest{
    
    private final ListaClientes listaClientes;
    
    public ListaClientesTest() {
        super();
        this.listaClientes = new ListaClientes(this.dataSource);
    }
    
    @Test
    public void testBuscarClienteExistente() {
     
        try {
            Cliente cliente5 = new Cliente(5, "prueba", 999999999, TipoCliente.VIP,3);
            this.listaClientes.mete(cliente5);
            Cliente cliente = this.listaClientes.busca(5);
            assertEquals(cliente.getCodigo(), 5);
        } catch (SQLException | NoExisteException ex) {
            fail();
        } 
    }
    
    @Test
    public void testBuscarClienteNoExistente() {
        
        try {
            this.listaClientes.busca(5);
            fail();
        } catch (SQLException ex) {
            fail();
        } catch (NoExisteException ex) {
        }
    }
}
