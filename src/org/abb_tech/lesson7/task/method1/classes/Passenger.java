package org.abb_tech.lesson7.task.method1.classes;

import java.util.LinkedList;

public class Passenger {
    // PRIVATE FIELDS
    private String name;
    private boolean isPriority;
    private Stop currentStop;
    private Stop lastStop;
    private Bus bus;

    // PARAMETRIC CONSTRUCTOR
    public Passenger(String name,boolean isPriority,Stop currentStop,Stop lastStop,Bus bus){
        setName(name);
        setPriority(isPriority);
        setCurrentStop(currentStop);
        setLastStop(lastStop);
        setBus(bus);
    }

    // METHODS
    @Override
    public String toString() {
        return String.format("Name:%s\nWaiting For Bus Number:%d\nLast Stop Location:%s", (isPriority ? name + "(Priority)" : name + "(Normal)"),bus.getNumber(),lastStop == null ? "No Stop !" : lastStop.getLocation());
    }

    public void boardTheBus(Bus bus){
        setBus(bus);
        if(bus != null)
            bus.addPassenger(this);
        System.out.println(String.format("%s boarded the bus",this.name));
    }

    public void leaveTheStop(Stop stop){
        // Don't poll again - just print info about THIS passenger
        System.out.println(String.format("%s with %s priority left the stop",
                this.name, this.isPriority ? "priority" : "no"));
    }

    public void leaveTheBus(Bus bus){
        // REMOVE PASSENGER FROM THE BUS
        bus.getPassengers().remove(this);
        System.out.println("Passenger " + this.name + " left the bus - " + bus.getNumber() + " in the stop " + this.lastStop.getLocation() );
    }

    public void goToNewStop(Stop stop){
        if(stop != null )
            setCurrentStop(stop);
    }

    // SETTERS
    public void setName(String name){
        this.name = name;
    }

    public void setPriority(boolean isPriority){
        this.isPriority = isPriority;
    }

    public void setLastStop(Stop lastStop){
        this.lastStop = lastStop;
    }

    public void setBus(Bus bus){
        this.bus = bus;
    }

    public void setCurrentStop(Stop currentStop){
        this.currentStop = currentStop;
    }

    // GETTERS
    public String getName() {
        return name;
    }

    public boolean getPriority(){
        return isPriority;
    }

    public Stop getLastStop(){
        return lastStop;
    }

    public Stop getCurrentStop(){return  currentStop;}

    public Bus getBus(){
        return bus;
    }
}
