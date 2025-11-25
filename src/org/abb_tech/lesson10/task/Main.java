package org.abb_tech.lesson10.task;

import org.abb_tech.lesson10.task.classes.PizzaOrder;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        long simStart = System.currentTimeMillis();

        PizzaOrder[] orders = new PizzaOrder[5];

        // creating 5 pizza order then starting
        for (int i = 0; i < 5; i++) {
            orders[i] = new PizzaOrder(i + 1);
            orders[i].start();
        }

        // main waits for other threads
        for (PizzaOrder order : orders) {
            order.join();
        }

        // fastest order
        PizzaOrder fastest = orders[0];
        for (PizzaOrder order : orders) {
            if (order.getTotalTimeSec() < fastest.getTotalTimeSec()) {
                fastest = order;
            }
        }

        long simEnd = System.currentTimeMillis();
        long totalSimTime = (simEnd - simStart) / 1000;

        System.out.println("\n=======================================");
        System.out.println("All orders completed!");
        System.out.println("Total simulation time: " + totalSimTime + " seconds");
        System.out.println("Fastest order: Order #" +
                fastest.getOrderId() + " → " +
                fastest.getTotalTimeSec() + " sec");
        System.out.println("=======================================\n");
    }
}
