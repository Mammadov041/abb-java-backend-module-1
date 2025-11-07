package org.abb_tech.lesson7.task.method1.classes;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Stop {
    // PRIVATE FIELDS
    private String location;
    private PriorityQueue<Passenger> passengers = new PriorityQueue<>(
            Comparator.comparing((Passenger p) -> !p.getPriority()) // false (priority) before true (normal)
    );

    // PARAMETRIC CONSTRUCTOR
    public Stop(String location){
        setLocation(location);
    }

    // METHODS
    public void addPassenger(Passenger passenger){
        if(passengers.size() == 10){
            System.out.println("The maximum amount of passenger reached can not add .");
            return;
        }
        passengers.offer(passenger);
        passenger.goToNewStop(this);
        System.out.println(String.format("Passenger added to stop : %s successfully.",this.getLocation()));
        System.out.println(String.format("Current count of passengers in stop - %s : %d",this.getLocation() ,passengers.size()));
    }

    public void busArrived(Bus bus){
        System.out.println("Bus" + bus.getNumber() + " arrived to stop - " + this.location);
        // CHECK EVERY PASSENGER'S LAST STOP INSIDE BUS FOR LETTING THEM LEAVE IF IT'S PROPER STOP FOR THEM
        for (int i = bus.getPassengers().size() - 1; i >= 0; i--){
            if(bus.getPassengers().get(i).getLastStop().getLocation().equals(this.location)){
                bus.getPassengers().get(i).leaveTheBus(bus);
            }
        }
        // PASSENGERS LEAVING THE STOP BY PRIORITY
        while (!passengers.isEmpty()) {
            var p = passengers.poll();
            p.leaveTheStop(this);
            p.boardTheBus(bus);
        }
    }
    @Override
    public String toString() {
        StringBuilder resultString = new StringBuilder();
        for(Passenger passenger : passengers){
            resultString.append(passenger.getName() + ";");
        }
        return String.format("====STOP INFO====\nLocation:%s\nPassengers:%s",location,resultString);
    }

    // GETTERS
    public String getLocation(){
        return location;
    }

    public PriorityQueue<Passenger> getPassengers(){
        return passengers;
    }

    // SETTERS
    public void setLocation(String location){
        this.location = location;
    }
}
