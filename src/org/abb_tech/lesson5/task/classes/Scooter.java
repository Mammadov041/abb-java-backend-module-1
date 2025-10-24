package org.abb_tech.lesson5.task.classes;

import org.abb_tech.lesson5.task.interfaces.Transport;

public class Scooter implements Transport {
    // override methods
    @Override
    public void calculateFare(double distance) {
        double fare = distance * 2;
        System.out.println(String.format("Fare for scooter per passenger for %f km is $%f",distance,fare));
    }

    @Override
    public void calculateTime(double distance) {
        double hourPerKm = 0.5;
        System.out.println("For + " + distance + " km you need to go " + hourPerKm * distance + " with scooter");
    }

    @Override
    public String getTransportInfo() {
        return String.format("SCOOTER INFO");
    }

    @Override
    public void calculateFare(double distance, int passengers) {
        double totalFare = distance * 2 * passengers;
        System.out.println(String.format("Total fare for scooter for %f km is $%f",distance,totalFare));
    }
}
