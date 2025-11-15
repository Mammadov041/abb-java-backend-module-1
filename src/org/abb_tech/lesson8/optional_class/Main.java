package org.abb_tech.lesson8.optional_class;

import java.util.Optional;

public class Main {
    static void main(String[]args) {
        Integer integerObject = 15;
        Optional<Integer> optionalIntegerObject = Optional.of(integerObject);

        var optionalIntegerObjectPresent = optionalIntegerObject.isPresent();
        System.out.println(optionalIntegerObjectPresent);


    }
}
