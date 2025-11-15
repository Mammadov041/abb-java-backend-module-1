package org.abb_tech.lesson8.exercise.classes;

public class Car {
    private int id;
    private String model;
    private int year;
    private String brand;

    public Car(int id,int year,String model,String brand){
        this.id = id;
        this.year = year;
        this.model = model;
        this.brand = brand;
    }

    // methods
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Car car)
            return car.id == this.id;
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public String toString() {
        return String.format("=== CAR INFO ===\n=== ID:%d ===\n=== MODEL:%s ===\n=== YEAR:%d ===\n=== BRAND:%s ===\n"
                ,id,model,year,brand);
    }

    // getters
    public int getId(){
        return id;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }
}
