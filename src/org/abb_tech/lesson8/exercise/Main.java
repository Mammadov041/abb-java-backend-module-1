package org.abb_tech.lesson8.exercise;

import org.abb_tech.lesson8.exercise.classes.Car;
import org.abb_tech.lesson8.exercise.classes.CarRentalSystem;
import org.abb_tech.lesson8.exercise.classes.Customer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CarRentalSystem system = new CarRentalSystem();
        Car c1 = new Car(1,2020,"Sonata" , "Hyundai");
        Car c2 = new Car(2, 2024,"Chiron","Bugatti");
        Car c3 = new Car(3, 2025,"S-500","Mercedes" );

        system.addCar(c1);
        system.addCar(c2);
        system.addCar(c3);

        Customer u1 = new Customer(101, "Aydin" , "AZ12345");
        Customer u2 = new Customer(102, "Nigar", "AZ67890");

        system.rentCar(u1, c1);
        system.rentCar(u2, c2);

        system.printActiveRentals();

        system.printAvailableCars();

        Thread.sleep(10000);
        system.returnCar(u1);

        system.printRentalHistory();

        system.printAvailableCars();
    }
}
