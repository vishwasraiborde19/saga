package com.paymen.core.message.producer.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.paymen.core.message.producer.entity.Envelop;
import com.paymen.core.message.producer.repo.CassandraRepo;

public class CassandraService {
	
	@Autowired
	private CassandraRepo cassandraRepo ;
	
	
	public void save(Envelop envelop) {
		cassandraRepo.save(envelop);
	}
 
}
