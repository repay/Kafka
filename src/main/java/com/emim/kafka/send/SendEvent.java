package com.emim.kafka.send;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class SendEvent {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String msg) {
        String topicName = "myEventTopic";
        kafkaTemplate.send(topicName, msg);
    }
}
