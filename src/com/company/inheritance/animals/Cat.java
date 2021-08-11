package com.company.inheritance.animals;

public class Cat implements Animal{
    private String name = "#nonamecat";

    public Cat() {}

    public Cat(String name) {
        this.name = name;
    }
    @Override
    public int getMaxAge() {
        return 25;
    }

    public void printName() {
        System.out.println("Hi, I'm cat, my name is " + name);
    }
}
