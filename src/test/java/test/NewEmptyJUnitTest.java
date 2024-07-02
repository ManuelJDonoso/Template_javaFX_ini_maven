/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Manuel Jesús Donoso Pérez
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeAll
    public static void antes() {
        System.out.println("::Antes::");
    }
    
    @AfterAll
    public static void despues() {
        System.out.println("::afterAll::");
    }
    
    @BeforeEach
    public void iniciar() {
        System.out.println("::beforeEach::");
    }
    
    @AfterEach
    public void terminar() {
        System.out.println("::afterEach::");
    }
    
    @Test
    public void testUno(){
        System.out.println("::testUno:: hola");
 
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
