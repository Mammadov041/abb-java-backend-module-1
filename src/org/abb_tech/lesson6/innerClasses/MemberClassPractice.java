package org.abb_tech.lesson6.innerClasses;

public class MemberClassPractice {
    Car car = new Car("Porsche","Black",4);
    Car.Engine engine = new Car("Ferrari","Red",4).new Engine(500);

    public void CallSomeMethods(){
        engine.start();
        car.drive();
    }
}
