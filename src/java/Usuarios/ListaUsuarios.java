package Usuarios;

import java.util.Arrays;

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
    
    Usuario[] listaClientes;
 
    
    public ListaUsuarios(){    
    listaClientes= new Usuario[0];   
    }
    
    
    public void mete(Usuario cliente){
        listaClientes = Arrays.copyOf(listaClientes, listaClientes.length + 1);
        listaClientes[listaClientes.length-1] = cliente;
    }
    
  
    
}
