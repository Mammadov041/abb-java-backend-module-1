package org.abb_tech.lesson10.concurrency.classes;

public class ThreadWithRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Running with Runnable .");
    }
}
