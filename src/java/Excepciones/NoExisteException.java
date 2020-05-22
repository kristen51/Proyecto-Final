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
public class NoExisteException extends ExisteException{
    
    private Object elemento;
    
    public NoExisteException(Object elemento) {
        super(elemento, "no");
        this.elemento = elemento;
    }
}
