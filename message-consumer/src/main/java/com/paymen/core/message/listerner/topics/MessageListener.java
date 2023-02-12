package com.paymen.core.message.listerner.topics;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.paymen.core.message.Envelop;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class MessageListener {
	
	
	public static final String PAYMENT_INIT = "PAYMENT_INIT";
	public static final String GROUP_ID = "group-id";
		
	@KafkaListener(topics = {"#{'${app.kafka.listener.topic}'.split(',')}"}, groupId = "'${app.kafka.listener.group-id}")
    public void listen2(@Payload Envelop data) {
       log.info("Message Reveived {}",data);
    }

}
