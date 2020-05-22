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
public class YaExisteException extends ExisteException{

    private Object elemento;
    
    public YaExisteException(Object elemento) {
        super(elemento, "ya");
        this.elemento = elemento;
    }
    
}
