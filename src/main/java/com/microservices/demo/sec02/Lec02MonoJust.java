package com.microservices.demo.sec02;

import com.microservices.demo.sec1.subscriber.SubscriberImpl;
import reactor.core.publisher.Mono;

public class Lec02MonoJust {

    public static void main(String[] args) {

        Mono<String> mono = Mono.just("this is from mono");
        System.out.println(mono);
        SubscriberImpl subscriber = new SubscriberImpl();
        mono.subscribe(subscriber);

        subscriber.getSubscription().request(10);
    }
}
