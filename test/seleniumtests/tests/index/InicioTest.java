/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumtests.tests.index;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import seleniumtests.SeleniumTest;

/**
 *
 * @author Propietario
 */
public class InicioTest extends SeleniumTest {
    
    @Test
    public void testBotonInicialLlevaAMenuInicial() {
        
        WebElement botonInicio = driver.findElement(By.cssSelector("input[type='submit']"));
        botonInicio.click();
        String titulo = driver.getTitle();
       
        assertEquals("DriveFit", titulo);
    }
    
    @Test
    public void testComprobarTituloPáginaInicial() {
        
        assertEquals("Inicio", driver.getTitle());
    }
    
}
