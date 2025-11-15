package org.abb_tech.lesson8.stream_api;

public class Car {
    private String name;
    private String vendor;

    public Car(String name,String vendor){
        this.name = name;
        this.vendor = vendor;
    }

    public String getName(){
        return name;
    }

    public String getVendor(){
        return vendor;
    }

    @Override
    public String toString() {
        return "Name : " + name + "\n Vendor : " + vendor;
    }
}
