package org.abb_tech.lesson7.task.method1.classes;

import java.util.LinkedList;

public class Bus {
    // PRIVATE FIELDS
    private int busNumber;
    private String color;
    private LinkedList<Passenger> passengers = new LinkedList<>();
    private LinkedList<Stop>stops = new LinkedList<>();

    // PARAMETRIC CONSTRUCTOR
    public Bus(int busNumber,String color){
        setNumber(busNumber);
        setColor(color);
    }

    // GETTERS
    public int getNumber(){
        return busNumber;
    }

    public String getColor(){
        return color;
    }

    public LinkedList<Passenger> getPassengers(){
        return passengers;
    }

    public LinkedList<Stop> getStops(){
        return stops;
    }

    // SETTERS
    public void setNumber(int busNumber){
        this.busNumber = busNumber;
    }

    public void setColor(String color){
        this.color = color;
    }

    // METHODS
    public void addPassenger(Passenger passenger){
        if(passengers.size() == 5){
            System.out.println("Maximum count of passengers is 5 .");
            return;
        }
        boolean result = passengers.add(passenger);
        if(result){
            System.out.println("Passenger added success .");
            System.out.println("Current count of passengers : " + passengers.size());
            return;
        }
        System.out.println("Can not add the passenger try again .");
    }

    public void addStop(Stop stop){
        boolean result = stops.offer(stop);
        if(result){
            System.out.println(String.format("Stop - %s added to bus %d successfully .",stop.getLocation(),this.getNumber()));
            System.out.println(String.format("Current stop count in the bus - %d : %d", this.getNumber() ,stops.size()));
            return;
        }
        System.out.print("Can not add stop to the bus error occurred try again .");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Stop stop : stops){
            sb.append(stop.getLocation() + ";");
        }
        return String.format("=======BUS INFO=======\nBus Number:%d\nColor:%s\nStops:%s\n==========",busNumber,color,sb);
    }

    public void start(){
        System.out.println("==========BUS STARTED THE WORK==========");
        while(!this.stops.isEmpty()){
            Stop stop = this.stops.poll();
            stop.busArrived(this);
        }
    }
}
