package com.company;

public class Main {

    public static void main(String[] args) {
        int numThreads = 30;
        MyThread [] array = new MyThread[numThreads];

        for(int i = 0; i < numThreads; i++){
            array[i] = new MyThread(Integer.toString(i));
        }
        for (int i = 0; i < numThreads; i++) {
            synchronized (array[i]) { }
        }

        System.out.println("Main thread exiting.");
    }
}
