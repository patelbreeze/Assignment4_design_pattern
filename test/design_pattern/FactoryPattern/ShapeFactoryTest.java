/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package design_pattern.FactoryPattern;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Breeze
 * @version 1.0
 */
public class ShapeFactoryTest {

    public ShapeFactoryTest() {
    }

    // Create an instance of ShapeFactory
    ShapeFactory sh = new ShapeFactory();

    /**
     * Test of getShape method, of class ShapeFactory.
     */
    @Test
    public void testGetShape() {
        // Validate if null is returned when the input is null
        assertTrue(sh.getShape(null) == null);
    }

    /**
     * Test of getShape method, of class ShapeFactory.
     */
    @Test
    public void testGetShape_circle() {
        // Validate if the instance of Circle is returned when input is "circle"
        assertTrue(sh.getShape("circle") instanceof Circle);
    }

    /**
     * Test of getShape method, of class ShapeFactory.
     */
    @Test
    public void testGetShape_rectangle() {
        // Validate if the instance of Rectangle is returned when input is "rectangle"
        assertTrue(sh.getShape("rectangle") instanceof Rectangle);
    }

    /**
     * Test of getShape method, of class ShapeFactory.
     */
    @Test
    public void testGetShape_square() {
        // Validate if the instance of Square is returned when input is "square"
        assertTrue(sh.getShape("square") instanceof Square);
    }

    /**
     * Test of getShape method, of class ShapeFactory.
     */
    @Test
    public void testGetShape_null() {
        // Validate if null is returned for an unknown shape
        assertTrue(sh.getShape("unknown") == null);
    }

}
