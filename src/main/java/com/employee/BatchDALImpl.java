package com.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class BatchDALImpl implements BatchDAL {
	@Autowired
	private MongoTemplate batches;	
	@Override
	public List<Batch> viewBatch() {

		return batches.findAll(Batch.class);
	}
	@Override
	public Batch createBatch(Batch e) {
		return batches.save(e);

	}
	@Override
	public void deleteBatch(String empID) {
		batches.findAndRemove(new Query(Criteria.where("id").is(empID)), Batch.class);
		
	}
	
	
}
