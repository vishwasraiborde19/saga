package com.paymen.core.message.producer.repo;

import org.springframework.data.cassandra.repository.CassandraRepository;
import com.paymen.core.message.producer.entity.Envelop;

public interface CassandraRepo extends CassandraRepository<Envelop,Integer> {
 
}
