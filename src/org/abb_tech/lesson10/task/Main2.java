package org.abb_tech.lesson10.task;

import org.abb_tech.lesson10.task.classes.NewsPublisher;
import org.abb_tech.lesson10.task.classes.Subscriber;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        NewsPublisher publisher = new NewsPublisher();

        Subscriber s1 = new Subscriber("Subscriber-1", publisher);
        Subscriber s2 = new Subscriber("Subscriber-2", publisher);
        Subscriber s3 = new Subscriber("Subscriber-3", publisher);

        publisher.addSubscriber(s1);
        publisher.addSubscriber(s2);
        publisher.addSubscriber(s3);

        s1.start();
        s2.start();
        s3.start();

        int counter = 1;

        while (true) {
            String news = "Xəbər #" + counter++;
            Thread.sleep(2000); // 2 saniyədən bir xəbər yaradılır
            publisher.publishNews(news);
        }
    }
}

