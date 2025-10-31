package org.abb_tech.lesson6.innerClasses;

public class Car { // top level class
    private  String name;
    private  String color ;
    private  int numberOfWheels;

    public Car(String name,String color ,int numberOfWheels){
        this.name = name;
        this.color = color;
        this.numberOfWheels = numberOfWheels;
    }

    public void drive(){
        System.out.println("This drive method is inside Car class !");
    }

    public class Engine {
        private  int horsePower;

        public Engine(int horsePower){
            this.horsePower = horsePower;
        }

        public void start(){
            System.out.println("This start method is inside Engine class !");
            System.out.println("Engine started ! color is " + color +  " and has " + horsePower + " horse power");
        }
    }

    public  static class StaticEngine {
        public static int horsePower;

        public void DoSome(){
            System.out.println("Do something non static");
        }

        public  static void DoSome2(){
            System.out.println("Do something static");
        }

    }
}

