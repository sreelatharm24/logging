package com.ormb.logger.services;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(Consumer.class);

    // Need include topic
    // And we should know what to consume
    @KafkaListener(topics = "", groupId = "root_kafka-2_1")
    public String consume(String message) throws IOException {
        return message;
    }
}