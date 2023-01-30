package com.paymen.core.message.producer.controller;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paymen.core.message.producer.vo.Envelop;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController()
@RequestMapping("/producers/")
public class MessageProducerController {

	@Autowired
	KafkaTemplate<String, Object> kafkaTemplate;

	@Value("${app.kafka.producer.topic:DLQ}")
	private String topic;

	@PostMapping("/send")
	public void sendMessage(@RequestBody Envelop envelop) {
		CompletableFuture<SendResult<String, Object>> future = kafkaTemplate.send(topic, envelop);
		log.info("Received Envelop Message :{}", envelop);
	}

}
