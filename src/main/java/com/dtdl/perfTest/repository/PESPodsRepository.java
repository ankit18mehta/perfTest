package com.dtdl.perfTest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dtdl.perfTest.model.PESPods;

public interface PESPodsRepository extends MongoRepository<PESPods,String> {

	
	

}
