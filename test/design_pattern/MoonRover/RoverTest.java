package design_pattern.MoonRover;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Breeze Paatel
 * @version 1.0
 */
public class RoverTest {
    
    public RoverTest() {
    }
    /**
     * Test of pressRightPedal method, of class Rover.
     */
    Rover r = new Rover();
    @Test
    public void testPressRightPedal() {
        
        //1. Rover should always start in "At Rest" state
        assertEquals("At Rest",r.currentState.name);
        
        //2. When at rest, pressing right pedal twice should not move rover 
        r.pressRightPedal(2);
        assertEquals("At Rest",r.currentState.name);
        
        //3. When at rest, pressing right pedal once should move rover 
        r.pressRightPedal(1);
        assertEquals("Move Forward",r.currentState.name);
        
    }

    /**
     * Test of pressRightPedalForTime method, of class Rover.
     */
    @Test
    public void testPressRightPedalForTime() {
        
        //1. Can only press Right Pedal for Time when inside Move Forward State,it wont wrok when rover is At Rest state.
        r.pressRightPedalForTime(3);
        assertEquals("At Rest",r.currentState.name);
        
        //2. Transitioning from At Rest State to Move Forward State to check for right peda functionality 
        r.pressRightPedal(1);
        assertEquals("Move Forward",r.currentState.name);
        
        //3. When pressed right pedal for 5 sec, Transitioning from Accelerate subState to Constant Speed subState
        r.pressRightPedalForTime(5);
        assertEquals("Constant Speed",r.currentState.subState);
        
        //4. When pressed right pedal for 3 sec, Transitioning from Constant Speed subState to Decelerate subState
        r.pressRightPedalForTime(3);
        assertEquals("Decelerate",r.currentState.subState);
        
        
        
    }

    /**
     * Test of pressLeftPedal method, of class Rover.
     */
    @Test
    public void testPressLeftPedal() {
        //1. Left pedal can only be used when in Move Backward state
        r.pressLeftPedal(1);
        assertEquals("At Rest",r.currentState.name);
        
        //2.Transition to Move Backward state to access left pedal by pressing it for 5 sec
        r.pressLeftPedalForTime(5);
        assertEquals("Move Backward", r.currentState.name);
        
        //3. Left pedal when pressed in Move Backward state, rover transitions from Accelerate subState to Decelerate subState
        r.pressLeftPedal(2);
        assertEquals("Decelerate",r.currentState.subState);
        
        //4. Left pedal when pressed in Decelrate subState, rover transitions from Decelerate subState to Constant Speed subState
        r.pressLeftPedal(1);
        assertEquals("Constant Speed",r.currentState.subState);
            
        
    }

    /**
     * Test of pressLeftPedalForTime method, of class Rover.
     */
    @Test
    public void testPressLeftPedalForTime() {
        //1. Rover should always start in "At Rest" state
        assertEquals("At Rest",r.currentState.name);
        
        //2. When at rest, pressing left pedal for 5 sec
        r.pressLeftPedalForTime(5);
        assertEquals("Move Backward",r.currentState.name);
        
        //3. When at Move Backward state, pressing left pedal for 3 sec to move rover in constant backward speed subState
        r.pressLeftPedalForTime(3);
        assertEquals("Constant Speed",r.currentState.subState);
        
        //3. When at Move Backward state, pressing left pedal for 3 sec to accelerate the rover in forward direction
        r.pressLeftPedalForTime(3);
        assertEquals("Accelerate",r.currentState.subState);
        
    }

    /**
     * Test of printStateAndSubState method, of class Rover.
     */
    @Test
    public void testPrintStateAndSubState() {
    }

    /**
     * Test of main method, of class Rover.
     */
    @Test
    public void testMain() {
    }
    
}