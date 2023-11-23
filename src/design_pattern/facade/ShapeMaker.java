package design_pattern.facade;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * ShapeMaker class that encapsulates different shapes.
 * 
 * @author Breeze Patel
 * @version 1.0
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }
    
    public String drawCircle(){
        return circle.draw();
    }
     public String drawRectangle(){
        return rectangle.draw();
    }
     public String drawSquare(){
        return square.draw();
    }
}
