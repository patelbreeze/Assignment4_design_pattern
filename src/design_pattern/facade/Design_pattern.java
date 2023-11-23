/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package design_pattern.facade;

/**
 * Facade design pattern example.
 *
 * @version 1.0
 * @author Breeze
 */
public class Design_pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ShapeMaker sm = new ShapeMaker();
        sm.drawCircle();
        System.out.println(sm.drawCircle());
        sm.drawRectangle();
        System.out.println(sm.drawRectangle());
        sm.drawSquare();
        System.out.println(sm.drawSquare());
    }

}
