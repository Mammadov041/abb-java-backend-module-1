package org.abb_tech.lesson10.concurrency.classes;

public class Counter {
    private int counter;
    public Counter(int counter){
        this.counter = counter;
    }
    public void increment(){
        counter++;
        System.out.println("Count is " + counter);
    }
}
