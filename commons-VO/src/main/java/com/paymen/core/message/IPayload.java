package com.paymen.core.message;

public interface IPayload {

	Object getPayload();

	String getPayloadFormat();

	Object getPayloadMapper();

}
