/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Rober
 */
public class ExisteException extends Exception {

    private Object elemento;
    private String tipo;
    
    public ExisteException(Object elemento, String tipo) {
        super();
        this.elemento = elemento;
    }

    @Override
    public String getMessage() {
        return "Error!! El elemento " + elemento + " " + tipo + " existe";
    }

    
    
    
}
