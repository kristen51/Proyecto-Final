/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittests;

import Excepciones.NoExisteException;
import Usuarios.ListaUsuarios;
import Usuarios.Usuario;
import java.sql.SQLException;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author Propietario
 */
public class ListaUsuariosTest extends UnitTest {
    
    private final ListaUsuarios listaUsuarios;
    
    public ListaUsuariosTest(){
        super();
        this.listaUsuarios = new ListaUsuarios(this.dataSource);
    
    }
    
    @Test
    public void testGetUsuario()throws SQLException, NoExisteException{
        
        Usuario usuario1 = new Usuario(0, "user1", "user1@mail.com", "usuario1", "usuario1", "1234");
        this.listaUsuarios.mete(usuario1); 
            assertEquals(1, listaUsuarios.getNumUsuarios());
        assertEquals(usuario1.getCodigo(), listaUsuarios.getUsuario(0).getCodigo());
        assertEquals(usuario1.getNombreUsuario(), listaUsuarios.getUsuario(0).getNombreUsuario());
        
        assertEquals(usuario1.getEmail(), listaUsuarios.getUsuario(0).getEmail());
                  
    }
    
    @Test
    public void testGetNumUsuario() throws SQLException{
    
        Usuario usuario1 = new Usuario(0, "user1", "user1@mail.com", "usuario1", "usuario1", "1231");
        Usuario usuario2 = new Usuario(1, "user2", "user2@mail.com", "usuario2", "usuario3", "1232");
        Usuario usuario3 = new Usuario(2, "user3", "user3@mail.com", "usuario3", "usuario1", "1233");
        this.listaUsuarios.mete(usuario1); 
        this.listaUsuarios.mete(usuario2); 
        assertEquals(2, listaUsuarios.getNumUsuarios());
        this.listaUsuarios.mete(usuario3); 
        
        assertEquals(3, listaUsuarios.getNumUsuarios());
    
    
    }
    @Test
    public void testBuscarUsuario() throws SQLException{
        
        try{
        
        Usuario usuario1 = new Usuario(0, "user1", "user1@mail.com", "usuario1", "usuario1", "1231");
        Usuario usuario2 = new Usuario(1, "user2", "user2@mail.com", "usuario2", "usuario3", "1232");
        this.listaUsuarios.mete(usuario1); 
        this.listaUsuarios.mete(usuario2); 
        
        assertEquals(listaUsuarios.buscarUsuario("user1"), "1231");
        assertEquals(listaUsuarios.buscarUsuario("user2"), "1232");
        
        Assert.assertTrue(listaUsuarios.buscarUsuario("user3") == null);
        }catch(SQLException ex){
            fail();
        
        }
    
    }
    @Test
    public void testGetNombreUsuarioSegunIdentificador() throws SQLException{
        
        try{
        Usuario usuario1 = new Usuario(0, "user1", "user1@mail.com", "usuario1", "usuario1", "1231");
        Usuario usuario2 = new Usuario(1, "user2", "user2@mail.com", "usuario2", "usuario3", "1232");
        this.listaUsuarios.mete(usuario1); 
        this.listaUsuarios.mete(usuario2); 
        
        assertEquals(listaUsuarios.getNombreUsuarioSegunIdentificador("user1@mail.com"), "user1");
        assertEquals(listaUsuarios.getNombreUsuarioSegunIdentificador("user2@mail.com"), "user2");
        
        Assert.assertTrue(listaUsuarios.buscarUsuario("user3@mail.com") == null);
        }catch(SQLException ex){
            fail();
        
        }
    
    
    }
    @Test
    public void testGetCodSegunIdentificador() throws SQLException{
        try{
        Usuario usuario1 = new Usuario(0, "user1", "user1@mail.com", "usuario1", "usuario1", "1231");
        Usuario usuario2 = new Usuario(1, "user2", "user2@mail.com", "usuario2", "usuario3", "1232");
        this.listaUsuarios.mete(usuario1); 
        this.listaUsuarios.mete(usuario2); 
        
        assertEquals(listaUsuarios.getCodSegunIdentificador("user1@mail.com"),0);
        assertEquals(listaUsuarios.getCodSegunIdentificador("user2"), 1);
        
        Assert.assertFalse(listaUsuarios.getCodSegunIdentificador("user3@mail.com") == 3);
        }catch(SQLException ex){
            fail();
        
        }

    }
    @Test
    public void testGetNombreCompletoSegunIdentificador() throws SQLException{
        try{
        Usuario usuario1 = new Usuario(0, "user1", "user1@mail.com", "usuario1", "usuario1", "1231");
        Usuario usuario2 = new Usuario(1, "user2", "user2@mail.com", "usuario2", "usuario2", "1232");
        this.listaUsuarios.mete(usuario1); 
        this.listaUsuarios.mete(usuario2); 
        
        
    
        assertEquals(listaUsuarios.getNombreCompletoSegunIdentificador("user1@mail.com")[0],"usuario1");
        assertEquals(listaUsuarios.getNombreCompletoSegunIdentificador("user1@mail.com")[1],"usuario1");
        assertEquals(listaUsuarios.getNombreCompletoSegunIdentificador("user2")[0], "usuario2");
        assertEquals(listaUsuarios.getNombreCompletoSegunIdentificador("user2")[1], "usuario2");
        
        Assert.assertFalse(listaUsuarios.getNombreCompletoSegunIdentificador("user3@mail.com")[0] == "user3");
        }catch(SQLException ex){
            fail();
        
        }
    
    }
    @Test
    public void testUpdate() throws SQLException{
        try{
        Usuario usuario1 = new Usuario(0, "user1", "user1@mail.com", "usuario1", "usuario1", "1231");
        Usuario usuario2 = new Usuario(1, "user2", "user2@mail.com", "usuario2", "usuario3", "1232");
        this.listaUsuarios.mete(usuario1); 
        this.listaUsuarios.mete(usuario2);
        
        Usuario usuarioModificado = new Usuario(0, "user8", "user8@mail.com", "usuario8", "usuario8", "1238");
        
        listaUsuarios.update(usuario1);
        }catch(SQLException ex){
            fail();
        
        }
    
    
    }
    
    @Test
    public void testMete() throws SQLException{
        try{
        Usuario usuario1 = new Usuario(0, "user1", "user1@mail.com", "usuario1", "usuario1", "1231");
        Usuario usuario2 = new Usuario(1, "user2", "user2@mail.com", "usuario2", "usuario3", "1232");
        this.listaUsuarios.mete(usuario1); 
        this.listaUsuarios.mete(usuario2); 
        }catch(SQLException ex){
            fail();
        
        }
    
    }
    
}
    
