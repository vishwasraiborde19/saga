package com.paymen.core.message.producer.api;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import com.paymen.core.message.Envelop;

@Service
public class KafkaProducerService implements ProducerService{
	
	@Autowired
	KafkaTemplate<String, Object> kafkaTemplate;

	@Value("${app.kafka.producer.topic:DLQ}")
	private String topic;


	@Override
	public void sendMessage(Envelop envelop) {
		CompletableFuture<SendResult<String, Object>> future = kafkaTemplate.send(topic, envelop);	
	}

	@Override
	public void getStatus() {		
	}

}
