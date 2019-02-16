package com.company;

public class Singleton {
    static Singleton Instance1;
    static Singleton Instance2;
    static Singleton Instance3;
    String name;
    static public int counter = 1;

    private Singleton(String name_){name = name_;}

    static public synchronized Singleton getInstance(){
        if(counter == 1) {
            if (Instance1 == null) {
                Instance1 = new Singleton("Number 1");
                System.out.println("Object 1 created");
            }
            counter = 2;
            return Instance1;
        }
        else if(counter == 3) {
            if (Instance3 == null) {
                Instance3 = new Singleton("Number 3");
                System.out.println("Object 3 created");
            }
            counter = 1;
            return Instance3;
        }
        else{
            if(Instance2 == null){
                Instance2 = new Singleton("Number 2");
                System.out.println("Object 2 created");
            }
            counter = 3;
            return Instance2;
        }
    }

    public synchronized void print(String name, Singleton which){
        System.out.println("This is the output for " + name + " from Instance " + which.name);
    }
}
