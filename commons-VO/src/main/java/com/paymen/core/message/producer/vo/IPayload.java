package com.paymen.core.message.producer.vo;

public interface IPayload {

	Object setPayload(Object payload);

	String setPayloadFormat(String format);

	Object setPayloadMapper(Object mapperClass);

}
