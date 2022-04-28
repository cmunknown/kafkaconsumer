package com.example.configs;

import com.example.model.Person;
import lombok.SneakyThrows;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaListenerConfig {

    @SneakyThrows
    @KafkaListener(topics = "dto", groupId = "groupJSON", containerFactory = "kafkaListenerContainerFactoryJson")
    public void listenDto(Person user) {
        Thread.sleep(2000);
        System.out.println("KAFKA: Received JSON info--> : " + user);
    }

    @SneakyThrows
    @KafkaListener(topics = "string", groupId = "groupString", containerFactory = "kafkaListenerContainerFactoryString")
    public void listenString(String string) {
        Thread.sleep(2000);
        System.out.println("KAFKA: Received string info--> : " + string);
    }

    @SneakyThrows
    @KafkaListener(topics = "stringibm", groupId = "groupStringIBM", containerFactory = "kafkaListenerContainerFactoryStringIBM")
    public void listenStringIBM(String string) {
        Thread.sleep(2000);
        System.out.println("KAFKA: Received from IBM string info--> : " + string);
    }
}