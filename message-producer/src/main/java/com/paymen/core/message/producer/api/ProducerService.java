package com.paymen.core.message.producer.api;

import com.paymen.core.message.Envelop;

public interface ProducerService {

	void getStatus();

	void sendMessage(Envelop envelop);

}
