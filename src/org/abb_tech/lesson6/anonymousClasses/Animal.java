package org.abb_tech.lesson6.anonymousClasses;

public class Animal implements BreathService{

    @Override
    public void breath() {
        System.out.println("Animal is breathing !");
    }
}
