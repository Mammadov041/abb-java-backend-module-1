package org.abb_tech.lesson6.generics;

public class StringPrinter implements Printer{
    @Override
    public void print(Object[] objects) {
        if(objects.length != 0){
            for(Object object : objects){
                if(object instanceof String){
                    System.out.println(object);
                }
            }
        }
    }
}
