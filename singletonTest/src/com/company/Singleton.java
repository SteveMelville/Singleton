package com.company;

public class Singleton {
    static Singleton uniqueInstance;
    boolean isBoiled, isEmpty;

    private Singleton(){
        isBoiled = false;
        isEmpty = true;
    }

    static public synchronized Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
            System.out.println("Object created");
        }
        return uniqueInstance;
    }

    public void print(){
        System.out.print("This is the output");
    }

    public synchronized boolean boil(){
        if(!isBoiled && !isEmpty){
            System.out.println("Boiler Boiling");
            isBoiled = true;
        }
        return isBoiled;
    }

    public synchronized boolean fill(){
        if(isEmpty){
            System.out.println("Boiler Filling");
            isEmpty = false;
        }
        return !isEmpty;
    }

    public synchronized boolean empty(){
        if(!isEmpty && isBoiled){
            System.out.println("Boiler Emptying");
            isEmpty = true;
            isBoiled = false;
        }
        return isEmpty;
    }
}
