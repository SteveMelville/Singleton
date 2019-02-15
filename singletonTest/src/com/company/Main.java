package com.company;

public class Main {

    public static void main(String[] args) {


        for(int i = 0; i < 10; i++){
            new MyThread(Integer.toString(i));
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}
