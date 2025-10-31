package org.abb_tech.lesson6.generics;

public class GenericPrinter<T,R ,V> {
    public void print(T[] massive){
        for(T object : massive){
            System.out.println(object);
        }
    }
}
