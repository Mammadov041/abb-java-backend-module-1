package org.abb_tech.lesson5.task.classes;

import org.abb_tech.lesson5.task.interfaces.Transport;

public class Taxi implements Transport {
    // override methods
    @Override
    public void calculateFare(double distance) {
        double fare = distance * 4;
        System.out.println(String.format("Fare for TAXI per passenger for %f km is $%f",distance,fare));
    }

    @Override
    public void calculateTime(double distance) {
        double hourPerKm = 0.2;
        System.out.println("For + " + distance + " km you need to go " + hourPerKm * distance + " with taxi");
    }

    @Override
    public String getTransportInfo() {
        return String.format("TAXI INFO");
    }

    @Override
    public void calculateFare(double distance, int passengers) {
        double totalFare = distance * 4 * passengers;
        System.out.println(String.format("Total fare for taxi for %f km is $%f",distance,totalFare));
    }
}
