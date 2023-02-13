package com.paymen.core.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentInitilizerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentInitilizerApplication.class, args);
	}

}
