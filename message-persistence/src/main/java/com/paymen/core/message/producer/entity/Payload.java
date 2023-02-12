package com.paymen.core.message.producer.entity;

import org.springframework.data.cassandra.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Payload {
	
	String requestPayload;

}
