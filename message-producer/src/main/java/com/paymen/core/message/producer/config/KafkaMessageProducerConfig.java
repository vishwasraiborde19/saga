package com.paymen.core.message.producer.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.stereotype.Service;


public class KafkaMessageProducerConfig {
	
	public ProducerFactory<String, Object> producerConfig(){
		Map<String, Object> config = new HashMap();
		config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "");
		return new DefaultKafkaProducerFactory<String, Object>(config);
	}

}
