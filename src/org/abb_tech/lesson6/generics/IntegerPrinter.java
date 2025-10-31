package org.abb_tech.lesson6.generics;

public class IntegerPrinter implements Printer {

    @Override
    public void print(Object[] objects) {
        if(objects.length != 0){
            for(Object object : objects){
                if(object instanceof Integer){
                    System.out.println(object);
                }
            }
        }
    }
}
