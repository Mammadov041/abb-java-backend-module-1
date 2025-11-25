package org.abb_tech.lesson10.task.classes;

import java.util.concurrent.ThreadLocalRandom;

public class PizzaOrder extends Thread {

    private final int orderId;
    private long totalTimeSec;

    private static final Object lock = new Object(); // synchronized print üçün

    public PizzaOrder(int id) {
        this.orderId = id;
    }

    private void log(String msg) {
        synchronized (lock) {
            System.out.println("[Order #" + orderId + "] " + msg);
        }
    }

    private void sleepRandom(int min, int max) throws InterruptedException {
        int t = ThreadLocalRandom.current().nextInt(min, max + 1);
        Thread.sleep(t * 1000L);
        totalTimeSec += t;
    }

    @Override
    public void run() {
        try {
            long start = System.currentTimeMillis();

            log("Started.");
            log("Preparing pizza...");
            sleepRandom(1, 3);
            log("Preparation complete.");

            log("Baking pizza...");
            sleepRandom(3, 6);
            log("Baking complete.");

            log("Delivering pizza to customer...");
            sleepRandom(2, 5);
            log("Pizza delivered!");

            long end = System.currentTimeMillis();
            totalTimeSec = (end - start) / 1000;

            log("Total time: " + totalTimeSec + " seconds\n");

        } catch (InterruptedException e) {
            log("Error: " + e.getMessage());
        }
    }

    public long getTotalTimeSec() {
        return totalTimeSec;
    }

    public int getOrderId() {
        return orderId;
    }
}
