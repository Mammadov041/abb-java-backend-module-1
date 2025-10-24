package org.abb_tech.lesson4;

public class MethodOverloading {
    public void drive(int distance,String name){
        System.out.println("drive function 1 with 2 parameters");
        System.out.println(String.format("Car : %s \nDistance : %d",name,distance));
    }

    public void drive(int distance){
        System.out.println("drive function overload 2 with only 1 parameters");
        System.out.println("Car is getting " + distance + " km distance");
    }

    public void drive (int distance,String model,String vendor){
        System.out.println("drive function overload 3 with 3 parameters");
        System.out.println("Car is getting " + distance + " MOdel of car is " + model + " Vendor is " + vendor);
    }

    public String drive(double distance){
        return String.format("distance : %d",distance);
    }


}
