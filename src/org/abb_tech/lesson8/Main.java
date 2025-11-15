package org.abb_tech.lesson8;

import org.abb_tech.lesson8.interfaces.CarService;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Main {
    static void main(String[] args) {
        CarService cr = new CarService() {
            @Override
            public void repair() {
                System.out.println("This is anonymous class !");
            }
        };

        CarService crWithLambda = () -> {
            System.out.println("Repairing car  ...");
        };

        cr.repair();
        crWithLambda.repair();

        Predicate<String> isStringNull = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s == null;
            }
        };
        System.out.println(isStringNull.test("salamn"));

        BiFunction<Integer,Integer,Integer> addition = (s,s2) -> (s+s2);

        Predicate<Integer> oddOrNot = (digit) -> digit % 2 != 0;
    }
}
