package org.abb_tech.lesson10.task.classes;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisher {
    private final List<Subscriber> subscribers = new ArrayList<>();
    private String latestNews = null;

    public synchronized void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public synchronized void publishNews(String news) {
        latestNews = news;
        System.out.println("Publisher: Yeni xəbər yayımlandı -> " + news);

        notifyAll();  // bütün subscriber-ləri oyadır
    }

    public synchronized String getNews() {
        while (latestNews == null) {
            try {
                wait(); // xəbər olmayanda subscriber gözləyir
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        String newsToReturn = latestNews;
        latestNews = null; // xəbər alındı, yenisi gələnə qədər null edirik
        return newsToReturn;
    }
}
