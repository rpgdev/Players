package io.truelogic.jd.players.service;

import io.truelogic.jd.players.entity.Player;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PlayerProducer {

    /* TODO: autowire logger */
    private static final Logger logger = LoggerFactory.getLogger(PlayerProducer.class);
    @Value("${truelogic.topic}")
    private String topic;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(Player player) {
        logger.info(String.format("#### -> Produce player -> %s", player));
        this.kafkaTemplate.send(topic, player.toString());
    }
}
