package com.paymen.core.init.services;

import com.paymen.core.message.Envelop;

public interface ConsumerService {

	void getStatus();

	Envelop receiveMessage();

}
