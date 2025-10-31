package org.abb_tech.lesson6.object_override_methods;

public class Employee {
    private int age;
    private  String name;
    private double salary;

    public Employee(int age,String name,double salary){
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return String.format("Name : %s \nAge : %d \nSalary : %f",name,age,salary);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Employee employee){
            return employee.name.equals(this.name) && employee.age == this.age && employee.salary == this.salary;
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        String result = name + age + salary;
        return result.hashCode();
    }
}
