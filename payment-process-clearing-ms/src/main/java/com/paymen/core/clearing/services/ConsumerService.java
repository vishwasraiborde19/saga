package com.paymen.core.clearing.services;

import com.paymen.core.message.Envelop;

public interface ConsumerService {

	void getStatus();

	Envelop receiveMessage();

}
