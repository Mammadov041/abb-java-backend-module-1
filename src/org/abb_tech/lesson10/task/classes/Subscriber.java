package org.abb_tech.lesson10.task.classes;

public class Subscriber extends Thread {
    private final NewsPublisher publisher;
    private final String name;

    public Subscriber(String name, NewsPublisher publisher) {
        this.name = name;
        this.publisher = publisher;
    }

    @Override
    public void run() {
        while (true) {
            String news = publisher.getNews();
            update(news);
        }
    }

    public void update(String news) {
        System.out.println(name + " xəbər aldı: " + news);
    }
}
