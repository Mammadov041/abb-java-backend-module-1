package org.abb_tech.lesson6.anonymousClasses;

public class Anonymous {
    static void main() {
        BreathService breathService = new BreathService() {
            @Override
            public void breath() {
                System.out.println("This is something special for breathing ! ");
            }
        };
    }
}
