package com.paymen.core.process.services;

import com.paymen.core.message.Envelop;

public interface ConsumerService {

	void getStatus();

	Envelop receiveMessage();

}
