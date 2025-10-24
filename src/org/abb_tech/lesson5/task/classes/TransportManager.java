package org.abb_tech.lesson5.task.classes;
import org.abb_tech.lesson5.task.enums.TransportType;
import org.abb_tech.lesson5.task.interfaces.Transport;

public class TransportManager {
    public static Transport getTransport(TransportType type){
        return switch (type.name().toUpperCase()) {
            case ("TAXI") -> new Taxi();
            case ("SCOOTER") -> new Scooter();
            case ("BUS") -> new Bus();
            case ("BICYCLE") -> new Bicycle();
            default -> {
                System.out.println("No transport detected");
                yield null;
            }
        };

    }
}
