package com.company;

class MyThread implements Runnable {
    String name;
    Thread t;
    MyThread(String thread){
        name = thread;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start();
    }
    public void run() {
            Singleton single = Singleton.getInstance();
            single.fill();
            single.boil();
            single.empty();
            System.out.println(" for " + name);
            System.out.println(name + " exiting.");
    }
}