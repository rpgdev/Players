package io.truelogic.jd.players.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class PlayerConsumer {

    private final Logger logger = LoggerFactory.getLogger(PlayerProducer.class);

    @KafkaListener(topics = "${truelogic.topic}", groupId = "group_id")
    public void consume(String message){
        logger.info(String.format("#### -> Consumed player -> %s", message));
    }
}
