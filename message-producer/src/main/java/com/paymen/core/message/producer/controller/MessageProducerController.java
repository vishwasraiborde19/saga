package com.paymen.core.message.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paymen.core.message.Envelop;
import com.paymen.core.message.PaymentTransaction;
import com.paymen.core.message.producer.api.ProducerService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController()
@RequestMapping("/producers/")
public class MessageProducerController {

	@Autowired
	ProducerService producerService;

	@PostMapping("/send/blank")
	public void sendGenericMessage(@RequestBody Envelop envelop) {
		log.info("Sending Envelop Message to topic :{}", envelop);
		producerService.sendMessage(envelop);
	}

	@PostMapping("/send/payment")
	public void sendPaymentTransactionEnvelop(@RequestBody Envelop envelop) {
		log.info("Sending Envelop Message to topic :{}", envelop);
		producerService.sendMessage(envelop);
	}

	@PostMapping("/send/paymentTransacton")
	public void sendPaymentTransaction(@RequestBody PaymentTransaction paymentTransaction) {
		log.info("Sending Envelop Message to topic :{}", paymentTransaction);

		Envelop envelop = new Envelop();
		envelop.setPayload(paymentTransaction);
		producerService.sendMessage(envelop);
	}
}
