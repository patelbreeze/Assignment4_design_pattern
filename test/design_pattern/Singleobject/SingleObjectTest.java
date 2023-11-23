package design_pattern.Singleobject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Breeze Patel
 * @version 1.0
 */
public class SingleObjectTest {
    
    public SingleObjectTest() {
    }
  
    /**
     * Test method for checking if the getInstance() method always returns the same instance of the SingleObject class.
     * This method gets two instances of the SingleObject class using the getInstance() method,
     * and finally, it checks if both instances are equal, meaning that they refer to the same object in memory.
     */
    @Test
    public void testGetInstance() {
        SingleObject obj1=SingleObject.getInstance();
        SingleObject obj2=SingleObject.getInstance();
        assertTrue(obj1.equals(obj2));
    }

    /**
     * Test of showMessage method, of class SingleObject.
     */
    @Test
    public void testShowMessage() {
    }

    /**
     * Test method for getting the identifier value of the Singleton object.
     * This method sets the identifier value of the Singleton object using the setIdentifier() method,
     * then it gets the identifier value of the Singleton object using the getIdentifier() method,
     * and finally, it checks if the retrieved identifier value matches the set identifier value.
     */
    @Test
    public void testGetIdentifier() {
        SingleObject obj1=SingleObject.getInstance();
        obj1.setIdentifier("value 1");
        SingleObject obj2=SingleObject.getInstance();
        assertEquals("value 1", obj2.getIdentifier());
    }
    
    /**
     * Test of setIdentifier method, of class SingleObject.
     */
    @Test
    public void testSetIdentifier() {
    }
}