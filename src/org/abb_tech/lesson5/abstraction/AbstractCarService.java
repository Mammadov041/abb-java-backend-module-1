package org.abb_tech.lesson5.abstraction;

public abstract class AbstractCarService {
    public String name;
    public String destination;
    public String date;

    public AbstractCarService(String name, String destination, String date){
        this.name = name;
        this.destination = destination;
        this.date= date;
    }

    public abstract void repair();
    public void changeTiers(){
        System.out.println("Changing tiers");
    }

    public static void color(){
        System.out.println("Car's color's been changed");
    }

    public final void diagnostic(){
        System.out.println("Diagnostic !");
    }
}
