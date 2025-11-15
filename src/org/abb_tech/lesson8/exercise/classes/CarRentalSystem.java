package org.abb_tech.lesson8.exercise.classes;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CarRentalSystem {
    private final HashSet<Car> cars = new HashSet<>();
    private final Map<Customer,Car> customersAndRentedCars = new HashMap<>();
    private final Map<Car, LocalDateTime> rentedCars = new HashMap<>();
    private final HashSet<Car> freeCars = new HashSet<>();
    private final Map<Car,Duration> rentHistory = new HashMap<>();

    public void addCar(Car car){
        var addedToCars = this.cars.add(car);
        var addedToFreeCars = this.freeCars.add(car);
        if(addedToCars && addedToFreeCars) {
            System.out.println("Car added to the system with success");
        }
        else {
            System.out.println("Couldn't add car to the system !");
        }
    }

    public void rentCar(Customer customer,Car car){
        boolean isCarRented = customersAndRentedCars.containsValue(car);
        boolean isFreeCar = freeCars.contains(car);
        if(isCarRented && !isFreeCar) {
            System.out.println("Car is not free and not available!");
            return;
        }
        var added = customersAndRentedCars.put(customer,car);
        var added2 = rentedCars.put(car,LocalDateTime.now());
            System.out.println(String.format("Car %s was rented by customer -  %s with success.", car.getBrand() + " " + car.getModel() + " " + car.getYear(), customer.getName()));
            boolean deleted = freeCars.removeIf((c)->c.equals(car));
            if(deleted){
                System.out.println("Car removed from free cars list");
            }
            else{
                System.out.println("Car couldn't removed from the free car list .");
            }
    }

    public void returnCar(Customer customer){
        var rentedCar = customersAndRentedCars.get(customer);
        if(rentedCar != null){
            customersAndRentedCars.remove(customer);
            freeCars.add(rentedCar);
            var rentDate = rentedCars.get(rentedCar);
            rentHistory.put(rentedCar,Duration.between(rentDate,LocalDateTime.now()));
        }
        else{
            System.out.println("Car or customer not found .");
        }
    }

    public void printActiveRentals(){
        customersAndRentedCars.forEach( (customer,car) -> {
            System.out.println("=================================");
            System.out.println("Customer :" + customer.getName());
            System.out.println("Car :" + car.getModel() + " " + car.getBrand() + " (" + car.getYear() + ')');
            System.out.println("=================================");
            System.out.println();
        });
    }

    public void printAvailableCars(){
        System.out.println("===== Available Cars =====");
        freeCars.forEach(System.out::println);
    }

    public void printRentalHistory() {
        rentHistory.forEach((c, duration) -> {

            long days = duration.toDays();
            long hours = duration.toHours() % 24;
            long minutes = duration.toMinutes() % 60;
            long seconds = duration.getSeconds() % 60;

            System.out.println(String.format(
                    "Car - %s was rented for %d days %d hours %d minutes %d seconds",
                    c.getBrand() + " " + c.getModel() + " (" + c.getYear() + ")",
                    days, hours, minutes, seconds
            ));
        });
    }

}
