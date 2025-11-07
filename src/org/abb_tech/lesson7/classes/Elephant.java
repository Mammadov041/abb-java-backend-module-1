package org.abb_tech.lesson7.classes;

public class Elephant {
    private String name;
    private int age;
    private  String color;
    private  int numberOfLegs;

    public Elephant(String name, int age, String color, int numberOfLegs){
        this.age = age;
        this.name = name;
        this.color = color;
        this.numberOfLegs =numberOfLegs;
    }

    @Override
    public String toString() {
        return String.format("Name : %s\nAge : %d\nColor : %s\nNumber of legs : %d \n\n",name,age,color,numberOfLegs);
    }
}
