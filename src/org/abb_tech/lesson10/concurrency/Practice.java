package org.abb_tech.lesson10.concurrency;

import org.abb_tech.lesson10.concurrency.classes.Counter;
import org.abb_tech.lesson10.concurrency.classes.NotificationService;
import org.abb_tech.lesson10.concurrency.classes.ThreadWithExtend;
import org.abb_tech.lesson10.concurrency.classes.ThreadWithRunnable;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Practice {
    static void main(String[] args) {
//        ThreadWithExtend t = new ThreadWithExtend();
//        ThreadWithRunnable threadWithRunnable = new ThreadWithRunnable();
//        Thread t2 = new Thread(threadWithRunnable);
//        Thread t3 = new Thread(() -> {
//            System.out.println("Running thread ");
//        },"MyThread");
//
//        Thread.ofVirtual().factory().newThread(threadWithRunnable).start();
//        t3.start();
//        t.run();
//        t2.start();
//        try(ExecutorService executorService = Executors.newFixedThreadPool(10)){
//            for(int i = 0;i<10;i++){
//                executorService.execute(()->{
//                    System.out.println(LocalDateTime.now());
//                });
//            }
//        };
        var counter = new Counter(0);
        Runnable r = (()->{
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            counter.increment();
        });
//        var t1 = new Thread(r);
//        var t2 = new Thread(r);
//        var t3 = new Thread(r);
//        var t4 = new Thread(r);
//        var t5 = new Thread(r);
//
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();
        var notificationService = new NotificationService();
        Thread thread = new Thread(()->{
           try{
               notificationService.notifyUser();
           }
           catch (InterruptedException e){
               throw new RuntimeException(e);
           }
        });

        Thread thread1 = new Thread(()->{
           notificationService.notifyAdmin();
        });

        thread.start();
        thread1.start();
    }
}
