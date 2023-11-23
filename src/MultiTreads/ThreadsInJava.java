/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultiTreads;

/**
 *
 * @author Breeze
 */
class Thread1 extends Thread {

    @Override
    public void run() {
        for (int i
                = 1; i <= 1000; i++) {
            System.out.println(i);

        }
    }
}

//Defining second thread with task
//The task of this thread is to print the numbers from 1001 to 2000 
class Thread2 extends Thread {

    @Override
    public void run() {
        for (int i
                = 1001; i <= 2000; i++) {
            System.out.println(i);

        }
    }
}

public class ThreadsInJava {
//Main Thread

    public static void main(String[] args) {
//Creating first thread
        Thread1 t1 = new Thread1();
        t1.start();

//Creating second_thread 
        Thread2 t2 = new Thread2();
        t2.start();
    }
}
