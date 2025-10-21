package org.abb_tech.lesson4;

class Dog {
    public static double kg = 0;
    // static initializer block
//    static {
//        System.out.println("static block");
//    }
//
//    // initializer block
//    {
//        System.out.println("Object created !");
//    }

    public String name ;
    int age;
    protected  String other;
    private String gender;

    Dog(){
        name = "Anonymus";
    }

    Dog(String name){
        this.name = name;
    }

    Dog(int age ){
        this.age = age;
    }

    Dog(String name ,int age){
        this.name = name;
        this.age = age;
    }


    void run(long distance, String bark){
        System.out.println(name + " is running " + distance + " and barking like " + bark);
    }

    void eat(){
        if(name == "John"){
            Dog.kg += 10;
            System.out.println("Result KG of John : " + Dog.kg);
        }else if(name == "Bella"){
            Dog.kg += 20;
            System.out.println("Result KG of Bella : " + Dog.kg);
        }else if(name == "Mike"){
            Dog.kg += 30;
            System.out.println("Result KG of Mike : " + Dog.kg);
        }
    }



}
