package com.microservices.demo.sec1;

import com.microservices.demo.sec1.publisher.PublisherImpl;
import com.microservices.demo.sec1.subscriber.SubscriberImpl;

import java.time.Duration;

public class Demo {

    public static void main(String[] args) throws InterruptedException {
        // demoOne();
        // demoTwo();
        demoThree();
    }

    private static void demoOne() {
        var publisher = new PublisherImpl();
        var subscriber = new SubscriberImpl();
        publisher.subscribe(subscriber);
    }

    private static void demoTwo() throws InterruptedException {
        var publisher = new PublisherImpl();
        var subscriber = new SubscriberImpl();
        publisher.subscribe(subscriber);
        subscriber.getSubscription().request(3);
        Thread.sleep(Duration.ofSeconds(2));
        subscriber.getSubscription().request(3);
        Thread.sleep(Duration.ofSeconds(2));
        subscriber.getSubscription().request(3);
        Thread.sleep(Duration.ofSeconds(2));
        subscriber.getSubscription().request(3);
        Thread.sleep(Duration.ofSeconds(2));
        subscriber.getSubscription().request(3);
    }

    private static void demoThree() throws InterruptedException {
        var publisher = new PublisherImpl();
        var subscriber = new SubscriberImpl();
        publisher.subscribe(subscriber);
        subscriber.getSubscription().request(3);
        Thread.sleep(Duration.ofSeconds(2));
        subscriber.getSubscription().request(3);
        Thread.sleep(Duration.ofSeconds(2));
        subscriber.getSubscription().request(11);
    }
}
