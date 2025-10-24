package org.abb_tech.lesson5.inheritance;

public interface InterfaceAnimal {
    public abstract void eat();
    default void sleep(){
        System.out.println("InterfaceAnimal sleeping");
    }
}
