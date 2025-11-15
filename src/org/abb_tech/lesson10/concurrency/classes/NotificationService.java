package org.abb_tech.lesson10.concurrency.classes;

public class NotificationService {
    public void notifyUser() throws InterruptedException{
        synchronized (this){
            System.out.println("Trying to send notification to user ...");
            this.wait();
            System.out.println("Notifying user");
        }
    }

    public void notifyAdmin(){
        System.out.println("Trying to send notification to admin");
        synchronized (this){
            System.out.println("Sending notification admin");
            this.notifyAll();
        }
    }
}
