/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package design_pattern.Singleobject;

/**
 * SingletonPatternDemo is a class that demonstrates the Factory design pattern in action.
 * @author Breeze
 * @version 1.0
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {
//illegal construct
//Compile Time Error: The constructor SingleObject() is not visible //SingleObject object = new SingleObject();
//Get the only object available
        SingleObject object = SingleObject.getInstance();
//show the message 
        object.showMessage();
    }
}

