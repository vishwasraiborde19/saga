package com.paymen.core.message.listerner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MessageListenerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageListenerApplication.class, args);
	}

}
