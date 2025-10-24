package org.abb_tech.lesson5.task.classes;

import org.abb_tech.lesson5.task.interfaces.Transport;

public class Bicycle implements Transport {
    // override methods
    @Override
    public void calculateFare(double distance) {
        double fare = distance * 1;
        System.out.println(String.format("Fare for bicycle per passenger for %f km is $%f",distance,fare));
    }

    @Override
    public void calculateTime(double distance) {
        double hourPerKm = 0.7;
        System.out.println("For + " + distance + " km you need to go " + hourPerKm * distance + " with bicycle");
    }

    @Override
    public String getTransportInfo() {
        return String.format("BICYCLE INFO");
    }

    @Override
    public void calculateFare(double distance, int passengers) {
        double totalFare = distance * 1 * passengers;
        System.out.println(String.format("Total fare for bicycle for %f km is $%f",distance,totalFare));
    }
}
