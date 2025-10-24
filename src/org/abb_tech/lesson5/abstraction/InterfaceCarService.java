package org.abb_tech.lesson5.abstraction;

public interface InterfaceCarService {
    void repair();
    public static final String NAME = "Car Service";

    default void changeTires(){
        System.out.println("Changing tires");
    }

    static  void paint(){
        System.out.println("Painting car");
    }
}
