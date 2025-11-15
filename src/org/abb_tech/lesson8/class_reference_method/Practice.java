package org.abb_tech.lesson8.class_reference_method;

import java.util.List;
import java.util.stream.Collectors;

public class Practice {
    static void main(String[] args) {
        var listOfNumbers = List.of(10,5,2,1);
        listOfNumbers.forEach(ClassReference::getSquareOfNumber);

        var symbols = List.of('a','b','c','d');
        var asciiValuesWithTraditionalMapping =symbols
                .stream().map(s -> new AsciiValue(s)).collect(Collectors.toSet());

        var asciiValues = symbols
                .stream().map(AsciiValue::new).collect(Collectors.toSet());
    }
}
