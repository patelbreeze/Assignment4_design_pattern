package design_pattern.facade;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;
/**
 *@author Breeze Patel
 *@version 1.0
 */
public class ShapeMakerTest {
    
    public ShapeMakerTest() {
    }
    ShapeMaker shapeMaker = new ShapeMaker();
    /**
     * Test of drawCircle method, of class ShapeMaker.
     */
    @Test
    public void testDrawCircle() {
        // Create an instance of Circle
        Circle c1 = new Circle();

        // Compare the output of Circle's draw method with ShapeMaker's drawCircle method
        assertEquals(c1.draw(), shapeMaker.drawCircle());
    }
    /**
     * Test of drawRectangle method, of class ShapeMaker.
     */
    @Test
    public void testDrawRectangle() {
         // Create an instance of Rectangle
        Rectangle r1 = new Rectangle();
        // Compare the output of Rectangle's draw method with ShapeMaker's drawRectangle method        
        assertEquals(r1.draw(), shapeMaker.drawRectangle());
    }
    /**
     * Test of drawSquare method, of class ShapeMaker.
     */
    @Test
    public void testDrawSquare() {
        // Create an instance of Square
        Square s1 = new Square();
        // Compare the output of Square's draw method with ShapeMaker's drawSquare method
        assertEquals(s1.draw(), shapeMaker.drawSquare());
    }
    
}