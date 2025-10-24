package org.abb_tech.lesson5.inheritance;

public abstract class AbstractAnimal {
    private final String name;
    private final int age;

    protected AbstractAnimal(String name,int age){
        this.name = name;
        this.age = age;
    }

    public abstract void eat();
    public void sleep(){
        System.out.println("Animal is sleeping ");
    }
}
