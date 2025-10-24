package org.abb_tech.lesson5.task.interfaces;

public interface Transport {
    void calculateFare(double distance);
    void calculateTime(double distance);
    String getTransportInfo();
    void calculateFare(double distance, int passengers);
}
