package org.abb_tech.lesson5.task.classes;

import org.abb_tech.lesson5.task.interfaces.Transport;

public class Bus implements Transport {
    // override methods
    @Override
    public void calculateFare(double distance) {
        double fare = distance * 3;
        System.out.println(String.format("Fare for bus per passenger for %f km is $%f",distance,fare));
    }

    @Override
    public void calculateTime(double distance) {
        double hourPerKm = 0.3;
        System.out.println("For + " + distance + " km you need to go " + hourPerKm * distance + " with bus");
    }

    @Override
    public String getTransportInfo() {
        return String.format("BUS INFO");
    }

    @Override
    public void calculateFare(double distance, int passengers) {
        double totalFare = distance * 3 * passengers;
        System.out.println(String.format("Total fare for bus for %f km is $%f",distance,totalFare));
    }
}
