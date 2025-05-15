package com.priyanshi;

public class Alien {
    private int age;
    private Laptop lap;
    public  Alien(){
        System.out.println("Object Created");
    }

    public Alien(int age) {
        System.out.println("Paramerterized constructor called");
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setting the value");
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void code(){
        System.out.println("Coding");
        lap.compile();
    }
}
