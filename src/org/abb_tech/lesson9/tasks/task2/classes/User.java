package org.abb_tech.lesson9.tasks.task2.classes;

import java.io.Serializable;

public class User implements Serializable {
    private String username;
    private String email;
    private int age;

    public User(String username,String email,int age){
        setUsername(username);
        setEmail(email);
        setAge(age);
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("===== USER INFO =====\nUsername:%s\nEmail:%s\nAge:%d",this.username,this.email,this.age);
    }
}
