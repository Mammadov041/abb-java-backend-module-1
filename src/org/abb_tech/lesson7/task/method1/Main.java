package org.abb_tech.lesson7.task.method1;

import org.abb_tech.lesson7.task.method1.classes.Bus;
import org.abb_tech.lesson7.task.method1.classes.Passenger;
import org.abb_tech.lesson7.task.method1.classes.Stop;

public class Main {
    static void main(String[] args) {
        var bus = new Bus(125,"RED");

        var s = new Stop("LOKBATAN 233 YANI");
        var s2 = new Stop("28 may m/s");
        var s3 = new Stop("Sahil m/s");
        var s4 = new Stop("Peshe mektebi");
        var s5 = new Stop("Medeniyyet sarayi");

        var p = new Passenger("Seid",true,s,s2,bus);
        var p2 = new Passenger("Anar",false,s,s3,bus);
        var p3 = new Passenger("Senan",false,s,s4,bus);
        var p4 = new Passenger("Ulfet",false,s,s5,bus);
        var p5 = new Passenger("Cavidan",true,s, s5,bus);

        s.addPassenger(p);
        s.addPassenger(p2);
        s.addPassenger(p3);
        s.addPassenger(p4);
        s.addPassenger(p5);

        bus.addStop(s);
        bus.addStop(s2);
        bus.addStop(s3);
        bus.addStop(s4);
        bus.addStop(s5);

        bus.start();
    }
}
