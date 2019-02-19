package com.company;

public class Singleton {
    static Singleton Instance1;
    static Singleton Instance2;
    static Singleton Instance3;
    int count;
    String name;
    static public int counter = 1;

    private Singleton(String name_){name = name_; count = 0;}

    static public synchronized Singleton getInstance(){
        if(counter == 1) {
            if (Instance1 == null) {
                Instance1 = new Singleton("Number 1");
                System.out.println("Object 1 created");
            }
            counter = 2;
            Instance1.count++;
            return Instance1;
        }
        else if(counter == 3) {
            if (Instance3 == null) {
                Instance3 = new Singleton("Number 3");
                System.out.println("Object 3 created");
            }
            counter = 1;
            Instance3.count++;
            return Instance3;
        }
        else{
            if(Instance2 == null){
                Instance2 = new Singleton("Number 2");
                System.out.println("Object 2 created");
            }
            counter = 3;
            Instance2.count++;
            return Instance2;
        }
    }

    static public void printCount(){
        System.out.println(Instance1.count + " " + Instance2.count + " " + Instance3.count);
    }

    public synchronized void print(String name, Singleton which){
        System.out.println("This is the output for " + name + " from Instance " + which.name);
    }
}
