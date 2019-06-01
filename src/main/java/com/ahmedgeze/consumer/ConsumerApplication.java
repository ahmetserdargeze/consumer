package com.ahmedgeze.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

    @KafkaListener(topics = "Topic1",groupId = "group-id")
    public void listen(String message) {
        System.out.println("Received Messasge in group - group-id: " + message);
    }

}
