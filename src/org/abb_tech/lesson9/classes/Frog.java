package org.abb_tech.lesson9.classes;

import org.abb_tech.lesson9.exception.NameNullException;

import java.io.Closeable;
import java.io.IOException;

public class Frog extends Animal implements Closeable {
    private  String name;
    private int age;
    public Frog(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void jump() throws ArrayIndexOutOfBoundsException {
        System.out.println(this.name + " is jumping !");
        throw new ArrayIndexOutOfBoundsException();
    }

    @Override
    public void close() throws IOException {
        System.out.println("Frog close method");
        System.out.println("if there were errors this line of code worked.");
    }
}
