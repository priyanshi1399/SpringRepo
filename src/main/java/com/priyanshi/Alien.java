package com.priyanshi;

import java.beans.ConstructorProperties;

public class Alien {
    private int age;
    private Computer com;
    private int salary;

    public  Alien(){
       System.out.println("Object Created");
    }

    //this is constructor injection
//    @ConstructorProperties({"age","lap","salary"})
//    public Alien(int age, Laptop lap,int salary) {
//        this.age = age;
//        this.lap = lap;
//        this.salary=salary;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
      //  System.out.println("Setting the value");
        this.age = age;
    }

//    public Laptop getLap() {
//        return lap;
//    }
//
//    public void setLap(Laptop lap) {
//        this.lap = lap;
//    }


    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Coding");
        com.compile();
    }
}
