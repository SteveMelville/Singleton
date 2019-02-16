package com.company;

public class Singleton {
    static Singleton Instance1;
    static Singleton Instance2;
    static public boolean counter = true;

    private Singleton(){

    }

    static public synchronized Singleton getInstance(){
        if(counter) {
            if (Instance1 == null) {
                Instance1 = new Singleton();
                System.out.println("Object 1 created");
            }
            counter = false;
            return Instance1;
        }
        else{
            if(Instance2 == null){
                Instance2 = new Singleton();
                System.out.println("Object 2 created");
            }
            counter = true;
            return Instance2;
        }
    }

    public synchronized void print(String name, Singleton which){
        System.out.println("This is the output for " + name + " from Instance " + (which == Instance1 ? "1" : "2"));
    }


}
