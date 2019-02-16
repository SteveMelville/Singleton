package com.company;

class MyThread implements Runnable {
    String name;
    Thread t;
    MyThread(String thread){
        name = "Thread " + thread;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start();
    }
    public void run() {
            Singleton single = Singleton.getInstance();
            single.print(name, single);
    }
}