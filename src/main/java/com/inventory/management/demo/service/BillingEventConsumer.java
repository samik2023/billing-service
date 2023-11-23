package com.inventory.management.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class BillingEventConsumer {

    private static final String TOPIC = "orderTopic";

    @KafkaListener(topics = TOPIC,concurrency = "3" , groupId = "billing-group")
    private void listen(String msg) throws Exception{
        log.info("Received message : in billing service" + msg +  " in " + TOPIC );
        System.out.println("Received message in billingservice:" + msg +  " in " + TOPIC );
    }
}
