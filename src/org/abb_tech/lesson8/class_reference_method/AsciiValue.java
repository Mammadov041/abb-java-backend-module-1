package org.abb_tech.lesson8.class_reference_method;

public class AsciiValue {
    private final char character;
    private final int asciiValue;

    public AsciiValue(char character){
        this.asciiValue = character;
        this.character = character;
    }

    @Override
    public String toString() {
        return  "Ascii value{" + "character=" + character + ",ascii value=" + asciiValue + '}';
    }
}
