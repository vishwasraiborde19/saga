package com.paymen.core.message.listerner.api;

import com.paymen.core.message.Envelop;

public interface ConsumerService {

	void getStatus();

	Envelop receiveMessage();

}
