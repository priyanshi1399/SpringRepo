package com.priyanshi;

public class Alien {
    private int age;

    public  Alien(){
        System.out.println("Object Created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setting the value");
        this.age = age;
    }

    public void code(){
        System.out.println("Coding");
    }
}
