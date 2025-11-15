package org.abb_tech.lesson8.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {
    static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        // OR
        List<Car> cars2= List.of(new Car("X5","BMW"),new Car("X6","BMW"));
        Stream<Car> carStream = cars2.stream();
        var setOfFilteredCars = carStream
                .filter(c -> c.getVendor().equals("MERCEDES"))
                .collect(Collectors.toSet());

        var stringNumbers = List.of('1', '2', '3', 's', 'a');

        int sum = stringNumbers
                .stream()
                .reduce(0,
                        (acc, ch) -> acc + (int) ch.charValue(),
                        Integer::sum);

        System.out.println("Sum is " + sum);
    }
}
