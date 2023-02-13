package com.paymen.core.process.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;
import org.springframework.kafka.support.serializer.ErrorHandlingDeserializer;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.paymen.core.message.Envelop;

//@EnableKafka
//@Configuration
class KafkaMessageListenerConfig {
	
	
	public static final String BROKERS = "localhost:9092";
	public static final String GROUP_ID = "group-id";

//	@Bean
//	public ConsumerFactory<String, Envelop> consumerFactory() {
//		Map<String, Object> props = new HashMap<>();
//		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, BROKERS);
//		props.put(ConsumerConfig.GROUP_ID_CONFIG, GROUP_ID);
//		return new DefaultKafkaConsumerFactory<>(props, new StringDeserializer(),
//				new JsonDeserializer<>(Envelop.class));
//	}

	@Bean
	KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, Envelop>> kafkaListenerContainerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, Envelop> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory());
		return factory;
	}
	
	@Bean
	public ConsumerFactory<String, Envelop> consumerFactory() {
	
	    Map<String, Object> props = new HashMap<>();
	    props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, BROKERS);
	    props.put(ConsumerConfig.GROUP_ID_CONFIG, GROUP_ID);
	    props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
	    props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, ErrorHandlingDeserializer.class);
	    props.put(ErrorHandlingDeserializer.VALUE_DESERIALIZER_CLASS, JsonDeserializer.class);
	    props.put(JsonDeserializer.VALUE_DEFAULT_TYPE, Envelop.class);
	    return new DefaultKafkaConsumerFactory<>(props);
	}
}
