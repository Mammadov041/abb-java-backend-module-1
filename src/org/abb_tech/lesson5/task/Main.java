package org.abb_tech.lesson5.task;

import org.abb_tech.lesson5.task.classes.TransportManager;
import org.abb_tech.lesson5.task.enums.TransportType;
import org.abb_tech.lesson5.task.interfaces.Transport;

public class Main {
    static void main() {
        TransportType userChoice = TransportType.TAXI;
        double distance = 10.0;
        int passengers = 2;

        Transport transport = TransportManager.getTransport (userChoice);
        System.out.println(transport.getTransportInfo());
        transport.calculateFare(distance, passengers);
        transport.calculateTime(distance);

        TransportType userChoice2 = TransportType.SCOOTER;
        double distance2 = 20.0;
        int passengers2 = 4;

        Transport transport2 = TransportManager.getTransport (userChoice2);
        System.out.println(transport2.getTransportInfo());
        transport.calculateFare(distance2, passengers2);
        transport.calculateTime(distance2);

        TransportType userChoice3 = TransportType.BUS;
        double distance3 = 30.0;
        int passengers3 = 5;

        Transport transport3 = TransportManager.getTransport (userChoice3);
        System.out.println(transport3.getTransportInfo());
        transport.calculateFare(distance3, passengers3);
        transport.calculateTime(distance3);
    }
}
