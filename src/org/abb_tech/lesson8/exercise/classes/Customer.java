package org.abb_tech.lesson8.exercise.classes;

public class Customer {
    private int id;
    private String name;
    private String licenseNumber;

    public Customer(int id,String name,String licenseNumber){
        this.id = id;
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public int getId() {
        return this.id;
    }

    public String getLicenseNumber() {
        return this.licenseNumber;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Customer customer){
            return this.id == customer.id;
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(this.id);
    }

    @Override
    public String toString() {
        return String.format("=== CUSTOMER INFO ===\n=== ID:%d ===\n=== NAME:%s ===\n=== LICENSE NO:%d ===\n",this.id,this.name,this.licenseNumber);
    }
}
