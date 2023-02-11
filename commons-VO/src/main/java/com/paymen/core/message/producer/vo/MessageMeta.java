package com.paymen.core.message.producer.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

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
public class MessageMeta implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String eventName;
	private String eventVersion;
	private UUID eevntid;
	private String sourceSystem;
	private String targetSystem;
	private Date messageDispatchTime;

}
