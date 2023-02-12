package com.paymen.core.message;

import com.paymen.core.message.producer.vo.payload.payment.OrgnlTxRef;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class PaymentTransaction implements IPayload{
	
	OrgnlTxRef orgnlTxRef;
	String TrabsationStatus;
	
	
	@Override
	public OrgnlTxRef getPayload() {
		return this.orgnlTxRef;
	}
	@Override
	public String getPayloadFormat() {
		return "JSON";
	}
	@Override
	public Object getPayloadMapper() {
		return PaymentTransaction.class;
	}

}
