/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittests;

import Formularios.Formulario;
import Formularios.ListaFormularios;
import Usuarios.ListaUsuarios;
import Usuarios.Usuario;
import java.sql.SQLException;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author Propietario
 */
public class ListaFormulariosTest extends UnitTest {
    
    private final ListaUsuarios listaUsuarios;
    private final ListaFormularios listaFormularios;
    
    public ListaFormulariosTest(){
        super();
        this.listaUsuarios = new ListaUsuarios(this.dataSource);
        this.listaFormularios = new ListaFormularios(this.dataSource);
    
    }
    
    @Test
    public void testMete() throws SQLException{
        
        try{
        Formulario formulario1 = new Formulario("usuario1", "usuario1", "user1@mail.com", "123123123", "hola", 0);
        Usuario usuario1 = new Usuario(0, "user1", "user1@mail.com", "usuario1", "usuario1", "1234");
        this.listaUsuarios.mete(usuario1);        
        this.listaFormularios.mete(formulario1);
 
        }catch(SQLException ex){
            fail();
        
        }
    
    }
    
 
    
}
