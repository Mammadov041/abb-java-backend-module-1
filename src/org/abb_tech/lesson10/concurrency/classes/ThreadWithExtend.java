package org.abb_tech.lesson10.concurrency.classes;

public class ThreadWithExtend extends  Thread{
    @Override
    public void run() {
        System.out.println("Thread Extends Thread");
    }
}
